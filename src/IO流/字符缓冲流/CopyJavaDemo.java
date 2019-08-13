package IO流.字符缓冲流;

import java.io.*;

public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new FileReader("C:\\Users\\34759\\Desktop\\Copy.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\34759\\Desktop\\Copy(1).java")) ;
        char[] chs = new char[1024];
        int len;
        while ((len = br.read(chs)) != -1) {
            bw.write(chs, 0, len);
        }
        br.close();
        bw.close();
    }
}
