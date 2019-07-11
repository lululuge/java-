package IO流.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\34759\\Desktop\\fos.txt");
        fos.write("hello, io".getBytes());
        fos.close();
    }
}
