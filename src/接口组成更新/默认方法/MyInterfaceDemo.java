package 接口组成更新.默认方法;

public class MyInterfaceDemo {
    public static void main(String[] args) {
        // 利用多态创建对象
        MyInterface my = new MyInterfaceImpl1();
        my.show1();
        my.show2();
        my.show3();
        MyInterface.show4();
    }
}
