package IO流.字符流;

import java.io.*;

public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {
        // 创建字符输入流对象
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\34759\\Desktop\\java学习（idea）\\src\\IO流\\字符流\\CopyJavaDemo.java"));
        // 创建字符输出流对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\34759\\Desktop\\Copy.java"));
        // 读写数据，复制文件
        char[] chs = new char[1024];
        int len;
        while ((len = isr.read(chs)) != -1) {
            osw.write(chs, 0, len);
        }
        isr.close();
        osw.close();
    }
}
