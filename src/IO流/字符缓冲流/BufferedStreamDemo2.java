package IO流.字符缓冲流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStreamDemo2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
