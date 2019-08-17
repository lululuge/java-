package IO流.字符打印流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("pw.txt", true));
        pw.println("lu");
        pw.println("zan");
        pw.close();
    }
}
