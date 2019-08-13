package IO流.读写操作案例;

import java.io.*;

public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\34759\\Desktop\\java学习（idea）\\src\\IO流\\字符打印流\\PrintWriterDemo.java"));
        PrintWriter pw = new PrintWriter(new FileWriter("pw.java", true));
        String line;
        while ((line = br.readLine()) != null) {
            pw.println(line);
        }
        br.close();
        pw.close();
    }
}
