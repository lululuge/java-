package 递归;

import java.io.File;

// 递归遍历指定目录下所有指定后缀名的文件
public class Test2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\34759\\Desktop");
        getAllJavaFilePaths(file);
    }

    public static void getAllJavaFilePaths(File file) {
        File[] fileArray = file.listFiles();
        // 遍历file数组
        for (File f : fileArray) {
            if (!f.isFile()) {
                getAllJavaFilePaths(f);
            }
            else {
                if (f.getName().endsWith(".java")) {
                    System.out.println(f.getAbsolutePath());
                }
            }
        }
    }
}
