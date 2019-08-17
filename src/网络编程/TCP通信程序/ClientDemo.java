package 网络编程.TCP通信程序;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        // 创建客户端的Socket对象
        Socket s = new Socket("192.168.0.101", 10000);
        // 获取输出流，写数据
        OutputStream os = s.getOutputStream();
        os.write("hello，我来啦".getBytes());
        // 释放资源
        os.close();
        s.close();
    }
}
