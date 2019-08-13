package IO流.字符缓冲流;

import java.io.*;

public class CopyJavaDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\34759\\Desktop\\Copy.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\34759\\Desktop\\Copy(1).java"));
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
