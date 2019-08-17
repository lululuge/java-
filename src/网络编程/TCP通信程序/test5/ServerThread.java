package 网络编程.TCP通信程序.test5;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket s;

    public ServerThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        // 接收数据写入文本文件
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            // 解决上传文件名称冲突问题
            int count = 0;
//            long time = System.currentTimeMillis();
            File file = new File("copy[" + count + "].java");
            while (file.exists()) {
                count++;
                file = new File("copy[" + count + "].java");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            // 给出反馈信息
            BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("文件上传成功！");
            bwServer.newLine();
            bwServer.flush();
            // 释放资源
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
