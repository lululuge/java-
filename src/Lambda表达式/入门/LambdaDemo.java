package Lambda表达式.入门;

public class LambdaDemo {
    public static void main(String[] args) {
//        // 实现类方式
//        MyRunnable my = new MyRunnable();
//        Thread t = new Thread(my);
//        t.start();

//        // 匿名内部类的方式改进
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("多线程程序已启动");
//            }
//        }).start();

        // Lambda表达式方式改进
        new Thread(  () -> {
            System.out.println("多线程程序已启动");
        }).start();
    }
}
