package IO流.字符缓冲流;

import java.io.*;

public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 写数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
        bw.write("hello\r\n");
        bw.write("world\r\n");
        bw.close();

        // 读数据
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
//        // 一次读一个字符
//        int ch;
//        while ((ch = br.read()) != -1) {
//            System.out.print((char) ch);
//        }

        // 一次读一个字符数组
        char[] chs = new char[1024];
        int len;
        while ((len = br.read(chs)) != -1) {
            System.out.print(new String(chs, 0, len));
        }
        br.close();
    }
}
