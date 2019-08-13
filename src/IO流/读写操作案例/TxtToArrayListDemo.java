package IO流.读写操作案例;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TxtToArrayListDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        // 一次读取一行数据
        String line;
        while ((line = br.readLine()) != null) {
            arrayList.add(line);
        }
        br.close();
        // 遍历集合
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
