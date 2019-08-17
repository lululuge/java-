package 网络编程.TCP通信程序.test1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.0.101", 12345);
        OutputStream os = s.getOutputStream();
        os.write("hello,我来了!".getBytes());

        s.shutdownOutput();
        // 接收服务器端的反馈信息
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("客户端：" + data);

        s.close();
    }
}
