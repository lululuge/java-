package 多线程.生产者消费者案例;

public class BoxDemo {
    public static void main(String[] args) {
        // 创建奶箱对象，这是共享数据区域
        Box b = new Box();
        // 创建生产者对象
        Producer p = new Producer(b);
        // 创建消费者对象
        Customer c = new Customer(b);
        // 创建两个线程对象
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        // 启动线程
        t1.start();
        t2.start();
    }
}
