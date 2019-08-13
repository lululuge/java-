package 多线程.线程同步;

public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();
        Thread t1 = new Thread(st, "窗口1");
        Thread t2 = new Thread(st, "窗口2");
        Thread t3 = new Thread(st, "窗口3");
        // 启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
