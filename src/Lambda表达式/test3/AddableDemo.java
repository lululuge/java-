package Lambda表达式.test3;

import Lambda表达式.入门.LambdaDemo;

public class AddableDemo {
    public static void main(String[] args) {
        // 匿名内部类方式
        useAddable(new Addable() {
            @Override
            public int add(int x, int y) {
                int sum = x + y;
                return sum;
            }
        });
        System.out.println("-----------");
        // Lambda表达式
        useAddable( (int x, int y) -> {
            return x + y;
        });
    }

    private static void useAddable(Addable a) {
        System.out.println(a.add(5, 8));
    }
}
