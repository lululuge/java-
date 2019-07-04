package File;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        // 判断功能
        File file = new File("C:\\Users\\34759\\Desktop\\1.txt");
        file.createNewFile();
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());

    }
}
