package Lambda表达式.省略模式;

public class LambdaDemo {
    public static void main(String[] args) {
        useInter(() -> System.out.println("好好学习"));
    }

    private static void useInter(Inter i) {
        i.show();
    }
}
