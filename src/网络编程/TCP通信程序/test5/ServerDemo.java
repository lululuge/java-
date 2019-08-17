package 网络编程.TCP通信程序.test5;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
   服务器，接收到的数据写入文本文件，给出反馈，代码用线程进行封装，为每一个客户端开启一个线程
*/
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);
        // 服务器保持开启状态
        while (true) {
            Socket s = ss.accept();
            // 为每一个客户端开启一个线程
            ServerThread st = new ServerThread(s);
            Thread t1 = new Thread(st);
            t1.start();
        }
    }
}
