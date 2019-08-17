package 网络编程.InetAddress类;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("通信与网络技术国家工程中心");
        String name = address.getHostName();
        String ip = address.getHostAddress();
        System.out.println(name + ":" + ip);
    }
}
