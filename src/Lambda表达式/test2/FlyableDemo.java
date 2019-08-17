package Lambda表达式.test2;

public class FlyableDemo {
    public static void main(String[] args) {
        // 匿名内部类方式
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s + "会飞了");
            }
        });

        // Lambda表达式
        useFlyable( (s) -> {
            System.out.println(s + "会飞了");
        });
    }

    private static void useFlyable(Flyable f) {
        f.fly("陆昝");
    }
}
