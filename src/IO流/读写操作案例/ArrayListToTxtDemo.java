package IO流.读写操作案例;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToTxtDemo {
    public static void main(String[] args) throws IOException {
        // 创建集合
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("hello");
        arrayList.add("java");
        arrayList.add("world");

        BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
        // 遍历集合
        for (String s : arrayList) {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
