package Lambda表达式.引用对象的实例方法;

public class PrinterDemo {
    public static void main(String[] args) {
        // Lambda表达式
        usePrinter(s -> System.out.println(s.toUpperCase()));
        // 引用对象的实例方法
        usePrinter(new PrintString()::printUpper);
    }
    public static void usePrinter(Printer p) {
        p.printUpperCase("hello,world");
    }
}
