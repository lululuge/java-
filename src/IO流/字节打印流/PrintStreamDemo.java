package IO流.字节打印流;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream("ps.txt");
        ps.println(97);
        ps.println(98);
        ps.close();
    }
}
