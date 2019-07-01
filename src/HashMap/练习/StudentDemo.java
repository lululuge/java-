package HashMap.练习;

import java.util.HashMap;
import java.util.Set;

public class StudentDemo {
    public static void main(String[] args) {
        // 创建集合对象
        HashMap<String, Student> hm = new HashMap<String, Student>();
        // 创建学生对象
        Student s1 = new Student("tommy", 23);
        Student s2 = new Student("jack", 24);
        Student s3 = new Student("james", 30);

        hm.put("nba001", s1);
        hm.put("nba002", s2);
        hm.put("nba003", s3);

        // 遍历
        Set<String> set = hm.keySet();
        System.out.println("编号\t" + "姓名\t" + "年龄");
        for (String key : set) {
            System.out.println(key + "\t" + hm.get(key).getName() + "\t" + hm.get(key).getAge());
        }
    }
}
