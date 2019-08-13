package 多线程.生产者消费者案例;

public class Box {
    private int milk;
    // 表示奶箱是否有奶
    private boolean state = false;

    public synchronized void put(int milk) {
        // 若有牛奶，等待消费
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 若没有，就生产牛奶
        this.milk = milk;
        System.out.println("送奶工将第" + this.milk + "瓶奶放入奶箱");
        // 生产完毕，修改奶箱状态
        state = true;
        // 唤醒其他线程
        notifyAll();
    }

    public synchronized void get () {
        // 如果没有牛奶，等待生产
        if (!state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 如果有牛奶，就消费牛奶
        System.out.println("用户拿到第" + this.milk + "瓶奶");
        // 消费完毕，修改状态
        state = false;
        // 唤醒其他线程
        notifyAll();
    }
}
