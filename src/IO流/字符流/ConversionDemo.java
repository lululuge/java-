package IO流.字符流;

import java.io.*;

public class ConversionDemo {
    public static void main(String[] args) throws IOException {
        // 写数据
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("test.txt"));
        osw.write("我是中国人");
        osw.close();

        // 读数据
        InputStreamReader isr = new InputStreamReader(new FileInputStream("test.txt"));
        //一次读取一个字节
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.println((char) ch);
        }
        isr.close();
    }
}
