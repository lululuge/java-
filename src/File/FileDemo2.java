package File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        // 判断功能
        File file = new File("C:\\Users\\34759\\Desktop\\1.txt");
        file.createNewFile();
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());

        System.out.println(file.getName());
        System.out.println(file.length());
        Date d = new Date(file.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        System.out.println(sdf.format(d));

        File file2  = new File("C:\\Users\\34759\\Desktop");
        for (String s : file2.list()) {
            System.out.println(s);
        }

        for (File f : file2.listFiles()) {
            System.out.println(f.getName());
        }
    }
}
