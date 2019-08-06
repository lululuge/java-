package IO流.字节缓冲流;

import java.io.*;

public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("fos.txt", true));
        bos.write("world\r\n".getBytes());
        bos.close();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("fos.txt"));
//        int by;
//        while ((by = bis.read()) != -1) {
//            System.out.print((char) by);
//        }
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }
        bis.close();

    }
}
