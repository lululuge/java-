package 接口组成更新.默认方法;

public interface MyInterface {
    // 抽象方法
    void show1();
    void show2();
    // 默认方法
    default void show3() {
        System.out.println("默认方法");
    }
    // 静态方法
    static void show4() {
        System.out.println("静态方法");
    }
}
