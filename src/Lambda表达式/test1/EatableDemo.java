package Lambda表达式.test1;

public class EatableDemo {
    public static void main(String[] args) {
        // 方式1，调用useEatable（）方法
        Eatable e = new EatableImpl();
        useEatable(e);
        // 方式2， 匿名内部类
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("java真好玩");
            }
        });

        // 方式3，Lambda表达式
        useEatable( () -> {
            System.out.println("java真好玩");
        });
    }

    private static void useEatable(Eatable e) {
        e.eat();
    }

}
