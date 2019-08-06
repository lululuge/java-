package IO流.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 一次读取一个字节数组，标准代码
        FileInputStream fis = new FileInputStream("fos.txt");
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }
    }
}
