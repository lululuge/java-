package 多线程.线程同步;

public class SellTicket implements Runnable{
    private int tickets = 100;
    private Object obj = new Object();
    @Override
    public void run() {
        // 实现卖票动作
        // 相同的票出现了多次
        while (true) {
            synchronized (obj) {
                if (tickets > 0) {
                    // 通过sleep（）来模拟出票时间
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                    tickets--;
                }
            }
        }
    }
}
