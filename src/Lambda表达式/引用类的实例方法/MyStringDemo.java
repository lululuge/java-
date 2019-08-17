package Lambda表达式.引用类的实例方法;

public class MyStringDemo {
    public static void main(String[] args) {
        // Lambda表达式实现
        useMyString((s, x, y) -> s.substring(x, y));
        // 方法引用实现
        useMyString(String::substring);
    }

    public static void useMyString(MyString ms) {
        System.out.println(ms.mySubString("hellsdaadad", 1, 5));
    }
}
