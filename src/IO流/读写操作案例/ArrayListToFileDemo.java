package IO流.读写操作案例;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {
        // 创建集合
        ArrayList<Student> arrayList = new ArrayList<Student>();
        // 创建学生对象
        Student s1 = new Student("001", "陆昝", 23, "南京");
        Student s2 = new Student("002", "孙悟空", 63, "北京");
        Student s3 = new Student("003", "猪八戒", 43, "上海");
        Student s4 = new Student("004", "唐僧", 30, "深圳");
        // 将学生对象添加进集合
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);

        BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
        // 遍历集合
        for (Student s : arrayList) {
            // 将学生信息拼接成指定格式字符串
            StringBuilder sb = new StringBuilder();
            sb.append(s.getSid()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
