package IO流.读写操作案例;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileToArrayListDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        ArrayList<Student> arrayList = new ArrayList<Student>();
        // 读取文件数据
        String line;
        while ((line = br.readLine()) != null) {
            // 将读取到的数据用split进行分割
            String[] strArray = line.split(",");
            // 创建学生对象
            Student s = new Student();
            // 对学生对象进行赋值
            s.setSid(strArray[0]);
            s.setName(strArray[1]);
            s.setAge(Integer.parseInt(strArray[2]));
            s.setAddress(strArray[3]);
            // 将学生对象添加到集合
            arrayList.add(s);
        }
        br.close();
        // 遍历集合
        for (Student s : arrayList) {
            System.out.println(s.getSid() + "," + s.getName() + "," + s.getAge() + "," + s.getAddress());
        }
    }
}
