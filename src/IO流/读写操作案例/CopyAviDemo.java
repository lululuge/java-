package IO流.读写操作案例;

import java.io.*;

public class CopyAviDemo {
    public static void main(String[] args) throws IOException{
        // 记录开始时间
        long startTime = System.currentTimeMillis();
        // 复制视频
//        method1();
        method2();
        // 记录结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("复制共耗时" + (endTime - startTime) + "ms");
    }

    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\34759\\Desktop\\video.mp4");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\34759\\Desktop\\video(1).mp4");
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
    }

    public static void method2() throws IOException{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\34759\\Desktop\\video.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\34759\\Desktop\\video(1).mp4"));
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
    }
}
