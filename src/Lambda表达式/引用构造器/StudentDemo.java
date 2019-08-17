package Lambda表达式.引用构造器;

public class StudentDemo {
    public static void main(String[] args) {
        // Lambda表达式
        useStudentBuilder((name, age) -> new Student(name, age));

        // 引用方法
        useStudentBuilder(Student::new);
    }

    private static void useStudentBuilder(StudentBuilder sb) {
        Student s = sb.build("陆昝", 23);
        System.out.println(s.getName() + ":" + s.getAge());
    }
}
