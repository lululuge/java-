package 网络编程.TCP通信程序.test3;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.0.101", 10000);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        // 发送数据为键盘录入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }
            // 发送数据
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.close();
    }
}
