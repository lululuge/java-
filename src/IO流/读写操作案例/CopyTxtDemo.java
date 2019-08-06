package IO流.读写操作案例;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTxtDemo {
    public static void main(String[] args) throws IOException {
        // 创建字节输入流对象
        FileInputStream fis = new FileInputStream("fos.txt");
        // 创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("fos(1).txt");
        // 读取数据并写入到新的文件中
        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fos.close();
        fis.close();
    }
}
