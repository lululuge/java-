package Lambda表达式.引用类方法;

public class ConverterDemo {
    public static void main(String[] args) {
        useConverter(s -> Integer.parseInt(s));
        // 引用类方法
        useConverter(Integer::parseInt);
    }

    public static void useConverter(Converter c) {
        System.out.println(c.convert("7879"));
    }
}
