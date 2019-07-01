package HashMap.练习;

import java.util.HashMap;
import java.util.Set;

public class StudentDemo2 {
    public static void main(String[] args) {
        // 创建集合对象
        HashMap<Student, String> hm = new HashMap<Student, String>();
        // 创建学生对象
        Student s1 = new Student("tommy", 23);
        Student s2 = new Student("jack", 24);
        Student s3 = new Student("james", 30);
        Student s4 = new Student("james", 30);

        hm.put(s1, "nba001");
        hm.put(s2, "nba002");
        hm.put(s3, "nba003");
        hm.put(s4, "nba003");

        Set<Student> set = hm.keySet();
        System.out.println("name\t" + "age" + "\t编号");
        for (Student s : set) {
            System.out.println(s.getName() + "\t" + s.getAge() + "\t" + hm.get(s));
        }
    }
}
