package 递归;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        // 递归删除带内容的目录
        File srcFolder = new File("C:\\Users\\34759\\Desktop\\三国演义");
        deleteAllFolder(srcFolder);
    }

    public static void deleteAllFolder(File srcFolder) {
        // 获取该目录下的所有File数组
        File[] fileArray = srcFolder.listFiles();
        // 遍历该数组
        for (File f : fileArray) {
            if (f.isDirectory()) {
                deleteAllFolder(f);
            }
            else {
                f.delete();
            }
        }
        // 源目录中的内容删除完毕后，删除源文件夹

        srcFolder.delete();
    }
}
