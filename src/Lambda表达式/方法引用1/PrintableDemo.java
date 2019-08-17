package Lambda表达式.方法引用1;

public class PrintableDemo {
    public static void main(String[] args) {
        usePrintable((s -> System.out.println(s)));
        // 方法引用1
        usePrintable(System.out::println);
    }
    private static void usePrintable(Printable p) {
        p.printString("陆昝");
    }
}
