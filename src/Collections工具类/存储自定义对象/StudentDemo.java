package Collections工具类.存储自定义对象;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        // 创建集合对象
        List<Student> list = new ArrayList<Student>();
        // 创建学生对象
        Student s1 = new Student("詹姆斯", 33);
        Student s2 = new Student("库兹马", 23);
        Student s3 = new Student("戴维斯", 26);
        Student s4 = new Student("隆多", 31);
        Student s5 = new Student("伦纳德", 28);
        Student s6 = new Student("伦纳德", 28);

        // 添加元素到集合
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);

        // 排序
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.getAge() - s1.getAge();
                int num2 = num == 0 ? s2.getName().compareTo(s1.getName()) : num;
                return num2;
            }
        });

        // 去除重复元素
        List<Student> newList = new ArrayList<Student>();
        for (Student s : list) {
            if (!newList.contains(s)) {
                newList.add(s);
            }
        }

        // 遍历输出
        for (Student s : newList) {
            System.out.println(s.getName() + ";" + s.getAge());
        }
    }
}
