package 网络编程.UDP通信程序;

import java.io.IOException;
import java.net.*;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        // 创建发送端的Socket对象
        DatagramSocket ds = new DatagramSocket();
        // 创建数据并将数据打包
        byte[] bys = "hello,UDP,我来了".getBytes();
        DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("通信与网络技术国家工程中心"), 10086);
        // 发送数据
        ds.send(dp);
        // 关闭发送端
        ds.close();

    }
}
