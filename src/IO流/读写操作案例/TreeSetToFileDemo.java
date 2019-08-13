package IO流.读写操作案例;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
        // 创建TreeSet集合，通过比较器进行排序
        TreeSet<Person> ts = new TreeSet<Person>(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                // 成绩总分从高到低排序
                int num = p2.getSum() - p1.getSum();
                int num2 = num == 0 ? p2.getChinese() - p1.getChinese() : num;
                int num3 = num2 == 0 ? p2.getMath() - p1.getMath() : num2;
                int num4 = num3 == 0 ? p2.getName().compareTo(p1.getName()) : num3;
                return num4;
            }
        });

        // 键盘录入五个人的数据
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第" + (i+1) + "个人的信息：");
            System.out.println("姓名：");
            String name = sc.nextLine();
            System.out.println("语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("数学成绩：");
            int math = sc.nextInt();
            System.out.println("英语成绩：");
            int english = sc.nextInt();

            // 创建学生对象并进行赋值
            Person p = new Person();
            p.setName(name);
            p.setChinese(chinese);
            p.setMath(math);
            p.setEnglish(english);

            // 将学生对象加入到集合
            ts.add(p);
        }

        // 遍历集合，进行写入数据操作
        BufferedWriter bw = new BufferedWriter(new FileWriter("name.txt"));
        for (Person p : ts) {
            // 将字符串数据进行拼接
            StringBuilder sb  = new StringBuilder();
            sb.append(p.getName()).append(",").append(p.getChinese()).append(",").append(p.getMath()).append(",").append(p.getEnglish());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();

    }
}
