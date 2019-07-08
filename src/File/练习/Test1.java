package File.练习;

import java.io.File;
import java.io.FilenameFilter;

public class Test1 {
    public static void main(String[] args) {
        // 判断一个目录下的文件是否有.jpg文件
        // 方法1
        File file = new File("C:\\Users\\34759\\Desktop");
        for (File f : file.listFiles()) {
            if (f.isFile()) {
                if (f.getName().endsWith(".jpg")) {
                    System.out.println(f.getName());
                }
            }
        }

        // 方法2
        String[] strArray = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File file, String s) {
//                System.out.println(file + "---" + s);
                return new File(file, s).isFile() && s.endsWith(".jpg");
            }
        });

        for (String s : strArray) {
            System.out.println(s);
        }
    }
}
