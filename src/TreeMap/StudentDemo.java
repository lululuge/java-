package TreeMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class StudentDemo {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<Student, String>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });
        Student s1 = new Student("jack", 23);
        Student s2 = new Student("tom", 20);
        Student s3 = new Student("jerry", 22);
        Student s4 = new Student("james", 20);

        tm.put(s1, "001");
        tm.put(s2, "002");
        tm.put(s3, "003");
        tm.put(s4, "004");

        Set<Student> set = tm.keySet();
        for (Student key : set) {
            System.out.println(key.getName() + "-" + key.getAge() + "-" + tm.get(key));
        }
    }
}
