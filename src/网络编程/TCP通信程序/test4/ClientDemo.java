package 网络编程.TCP通信程序.test4;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.0.101", 12345);
        // 读取文件中的数据并发送
        BufferedReader br = new BufferedReader(new FileReader("fos.txt"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        // 给出数据发送结束标志
        s.shutdownOutput();
        // 接收反馈信息
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brClient.readLine();
        System.out.println("服务器的反馈：" + data);
        s.close();
    }
}
