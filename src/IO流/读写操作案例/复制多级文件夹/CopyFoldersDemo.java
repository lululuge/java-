package IO流.读写操作案例.复制多级文件夹;

import java.io.*;

public class CopyFoldersDemo {
    public static void main(String[] args) throws IOException{
        // 创建数据源file对象
        File srcFile = new File("C:\\Users\\34759\\Desktop\\test");
        // 创建目的地file对象
        File destFile = new File("C:\\Users\\34759\\Desktop\\java学习（idea）\\src");
        // 复制文件夹
        copyFolder(srcFile, destFile);
    }

    private static void copyFolder(File srcFile, File destFile) throws IOException {
        // 判断数据源file是否为目录
        if (srcFile.isDirectory()) {
            // 在目的地下创建和源file名称一样的目录
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile, srcFileName);
            if (!newFolder.exists()) {
                newFolder.mkdir();
            }
            // 获取源file下所有的file数组
            File[] fileArray = srcFile.listFiles();
            // 遍历该数组
            for (File file : fileArray) {
                // 递归调用
                copyFolder(file, newFolder);
            }
        }
        else {
            // 说明是文件，直接用字节流复制
            File newFile = new File(destFile, srcFile.getName());
            copyFile(srcFile, newFile);
        }
    }

    private static void copyFile(File srcFile, File newFile) throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));
        int len;
        byte[] bys = new byte[1024];
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
    }
}
