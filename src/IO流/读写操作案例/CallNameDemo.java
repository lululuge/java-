package IO流.读写操作案例;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CallNameDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("name.txt"));
        ArrayList<String> arrayList = new ArrayList<String>();
        String line;
        while ((line = br.readLine()) != null) {
            arrayList.add(line);
        }
        Random r = new Random();
        int index = r.nextInt(arrayList.size());
        System.out.println("幸运者是：" + arrayList.get(index));
    }

}
