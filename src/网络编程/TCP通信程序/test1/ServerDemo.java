package 网络编程.TCP通信程序.test1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12345);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        int len;
        byte[] bys = new byte[1024];
        while ((len = is.read(bys)) != -1) {
            System.out.println("服务器:" + new String(bys, 0, len));
        }
        // 给出反馈信息
        OutputStream os = s.getOutputStream();
        os.write("数据已收到！".getBytes());

        ss.close();
    }
}
