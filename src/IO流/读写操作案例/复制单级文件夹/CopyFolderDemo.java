package IO流.读写操作案例.复制单级文件夹;

import java.io.*;

public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        // 创建数据源目录file对象
        File srcFolder = new File("C:\\Users\\34759\\Desktop\\test");
        // 获取数据源目录名称
        String srcFolderName = srcFolder.getName();
        // 创建目的地目录file对象
        File destFolder = new File("C:\\Users\\34759\\Desktop\\java学习（idea）\\src", srcFolderName);

        // 判断目的地对应的file是否存在，不存在则创建
        if (!destFolder.exists()) {
            destFolder.mkdir();
        }

        // 获取源目录下的所有file数组
        File[] listFiles = srcFolder.listFiles();
        // 遍历file数组
        for (File file : listFiles) {
            String destFileName = file.getName();
            // 创建目的地file对象
            File destFile = new File(destFolder, destFileName);
            // 通过读取数据来复制文件
            copyFile(file, destFile);
        }
    }

    private static void copyFile(File file, File destFile) throws IOException{
        // 通过读取字节来复制
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        // 一次读取一个字节数组
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        bos.close();
        bis.close();
    }
}
