package 网络编程.UDP通信程序;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        // 创建接收端Socket对象，需要指定端口号
        DatagramSocket ds = new DatagramSocket(10086);
        // 创建一个数据包用于接收数据
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);
        // 接收数据
        ds.receive(dp);
        // 解析数据包并显示
        byte[] datas = dp.getData();
        int len = dp.getLength();
        System.out.println("传送的数据是：" + new String(datas, 0, len));
        ds.close();
    }
}
