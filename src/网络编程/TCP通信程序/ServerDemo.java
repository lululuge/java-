package 网络编程.TCP通信程序;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        // 创建服务端Socket对象
        ServerSocket ss = new ServerSocket(10000);
        // 获取输入流，读取数据
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len;
        while ((len = is.read(bys)) != -1) {
            System.out.println("接收的数据为：" + new String(bys, 0, len));
        }
        // 释放资源
        s.close();
        ss.close();
    }
}
