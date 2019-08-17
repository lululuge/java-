package Lambda表达式.方法引用2;


public class PrintableDemo {
    public static void main(String[] args) {
        // Lambda表达式
        usePrintable((i -> System.out.println(i)));
        // 方法引用
        usePrintable(System.out::println);
    }
    private static void usePrintable(Printable p) {
        p.printInt(666);
    }
}
