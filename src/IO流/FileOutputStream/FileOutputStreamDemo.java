package IO流.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");
        for (int i = 0; i < 10; i++) {
            fos.write("hello".getBytes());
            // 实现换行
            fos.write("\r\n".getBytes());
        }

//        fos.write("hello, io".getBytes());
//        fos.write("\r\n".getBytes());
//        fos.write(97);
        fos.close();
    }
}
