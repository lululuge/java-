package 网络编程.TCP通信程序.test5;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.0.101", 10000);
        // 读取文件并发送数据
        BufferedReader br = new BufferedReader(new FileReader("pw.java"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        // 发送结束标志
        s.shutdownOutput();
        // 接收反馈信息
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brClient.readLine();
        System.out.println("服务器反馈：" + data);

        // 释放资源
        br.close();
        s.close();
    }
}
