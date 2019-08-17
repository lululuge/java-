package Lambda表达式.函数式接口.常用接口.Consumer接口;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        operatorString("陆昝", s -> System.out.println(s));
        // 引用方法
//        operatorString("陆昝", System.out::println);
        operatorString("陆昝", s -> System.out.println(new StringBuilder(s).reverse().toString()));
        System.out.println("-----------");
        operatorString("林青霞", s -> System.out.println(s), s -> System.out.println(new StringBuilder(s).reverse().toString()));
    }
    // 消费一个字符串数据一次
    private static void operatorString(String str, Consumer<String> con) {
        con.accept(str);
    }
    // 消费一个字符串两次
    private static void operatorString(String str, Consumer<String> con1, Consumer<String> con2) {
        con1.andThen(con2).accept(str);
    }
}
