package 网络编程.UDP通信程序.test1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        // 创建发送数据
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入要发送的数据：");
            String input = sc.nextLine();
            if ("886".equals(input)) {
                System.out.println("发送结束！");
                break;
            }
            byte[] bys = input.getBytes();
            DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("通信与网络技术国家工程中心"), 10086);
            ds.send(dp);

        }
        ds.close();
    }
}
