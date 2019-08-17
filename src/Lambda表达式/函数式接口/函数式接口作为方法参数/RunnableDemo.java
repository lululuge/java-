package Lambda表达式.函数式接口.函数式接口作为方法参数;

public class RunnableDemo {
    public static void main(String[] args) {
        // 方式1，匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程已启动");
            }
        });

        // 方式2，Lambda表达式
        startThread(() -> System.out.println(Thread.currentThread().getName() + "线程已启动"));
    }
    private static void startThread(Runnable r) {
        new Thread(r).start();
    }
}
