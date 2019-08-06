package IO流.字符流;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyJavaDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\34759\\Desktop\\java学习（idea）\\src\\IO流\\字符流\\CopyJavaDemo.java");
        FileWriter fw = new FileWriter("C:\\Users\\34759\\Desktop\\Copy.java");
        // 读写数据
        char[] chs = new char[1024];
        int len;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
        }
        fr.close();
        fw.close();
    }
}
