package IO流.读写操作案例;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImgDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\34759\\Desktop\\前端学院设计图.jpg");
        FileOutputStream fos = new FileOutputStream("1.jpg");
        // 读写数据(一次一个字节数组)
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        fos.close();
        fis.close();
    }
}
