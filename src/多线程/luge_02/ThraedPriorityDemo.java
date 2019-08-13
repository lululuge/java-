package 多线程.luge_02;

public class ThraedPriorityDemo {
    public static void main(String[] args) {
        ThraedPriority tp1 = new ThraedPriority();
        ThraedPriority tp2 = new ThraedPriority();
        ThraedPriority tp3 = new ThraedPriority();

        tp1.setName("高铁");
        tp2.setName("飞机");
        tp3.setName("汽车");

        tp1.setPriority(5);
        tp2.setPriority(10);
        tp3.setPriority(1);

        tp1.start();
        tp2.start();
        tp3.start();

    }
}
