package 多线程.生产者消费者案例;

public class Producer implements Runnable{
    private Box b;

    public Producer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        // 生产牛奶
        for (int i = 1; i <= 5; i++) {
            b.put(i);
        }
    }
}
