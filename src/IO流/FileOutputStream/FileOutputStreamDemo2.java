package IO流.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 加入异常处理的字节流操作
public class FileOutputStreamDemo2 {
    public static void main(String[] args) {
        // 标准代码
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("C:\\Users\\34759\\Desktop\\fos2.txt");
            fos.write("hello,world!".getBytes());
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (fos != null) {
                try {
                    fos.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
