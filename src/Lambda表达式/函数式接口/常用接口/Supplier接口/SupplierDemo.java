package Lambda表达式.函数式接口.常用接口.Supplier接口;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        String s = getString(() -> "luzan");
        System.out.println(s);
    }

    // 定义一个方法返回一个字符串数据
    private static String getString(Supplier<String> sup) {
        return sup.get();
    }
}
