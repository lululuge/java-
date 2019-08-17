package 网络编程.TCP通信程序.test2;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.0.101", 10000);
        //  数据来自键盘录入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 封装输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                System.out.println("数据输入结束！");
                break;
            }
            // 发送数据
            OutputStream os = s.getOutputStream();
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.close();
    }
}
