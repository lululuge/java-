package File;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
//        File file = new File("C:\\Users\\34759\\Desktop\\a\\b\\c\\d");
//        // 创建文件夹
//        file.mkdirs();
//        // 创建文件
//        File file2 = new File("C:\\Users\\34759\\Desktop\\a\\b\\c\\d\\1.txt");
//        file2.createNewFile();
//        file2.delete();
//        file.delete();

        // 重命名
        File file3 = new File("C:\\Users\\34759\\Desktop\\1.txt");
        file3.createNewFile();
        File newFile = new File("C:\\Users\\34759\\Desktop\\2.txt");
        file3.renameTo(newFile);


    }
}
