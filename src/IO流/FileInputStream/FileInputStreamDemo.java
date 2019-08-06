package IO流.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

// 读数据
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");
        // 字节流读数据标准代码（一次读取一个字节）
        int by;
        while( (by = fis.read()) != -1) {
            System.out.print((char) by);
        }
        fis.close();
    }
}
