package 接口组成更新.私有方法;

public interface Inter {
    // 默认方法
    default void show1() {
        System.out.println("show1开始执行");
//        System.out.println("啦啦啦");
//        System.out.println("啦啦啦");
//        System.out.println("啦啦啦");
//        show();
        method();
        System.out.println("show1结束执行");
    }
    default void show2() {
        System.out.println("show2开始执行");
//        System.out.println("啦啦啦");
//        System.out.println("啦啦啦");
//        System.out.println("啦啦啦");
        show();
        System.out.println("show2结束执行");
    }
    // 静态方法
    static void method1() {
        System.out.println("method1开始执行");
//        System.out.println("啦啦啦");
//        System.out.println("啦啦啦");
//        System.out.println("啦啦啦");
        method();
        System.out.println("method1结束执行");
    }
    static void method2() {
        System.out.println("method2开始执行");
//        System.out.println("啦啦啦");
//        System.out.println("啦啦啦");
//        System.out.println("啦啦啦");
        method();
        System.out.println("method2结束执行");
    }
    // 私有方法
    private void show() {
        System.out.println("啦啦啦");
        System.out.println("啦啦啦");
        System.out.println("啦啦啦");
    }
    // 私有静态方法
    private static void method() {
        System.out.println("啦啦啦");
        System.out.println("啦啦啦");
        System.out.println("啦啦啦");
    }
}
