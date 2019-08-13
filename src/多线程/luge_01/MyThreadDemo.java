package 多线程.luge_01;

public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread my1 = new MyThread("线程1");
        MyThread my2 = new MyThread("线程2");

        my1.start();
        my2.start();
        // 返回当前main方法的线程名称
        System.out.println(Thread.currentThread().getName());
    }
}
