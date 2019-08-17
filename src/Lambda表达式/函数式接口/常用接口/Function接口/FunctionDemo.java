package Lambda表达式.函数式接口.常用接口.Function接口;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        convert("789", s -> Integer.parseInt(s));
        convert(100, i -> String.valueOf(i + 300));
        convert("255", s -> Integer.parseInt(s), i -> String.valueOf(i + 5));
    }

    // 定义一个方法，将一个字符串转换为int类型
    private static void convert(String s, Function<String, Integer> fun) {
        int i = fun.apply(s);
        System.out.println(i);
    }

    // 定义一个方法，把一个int类型数据加上一个整数之后，转为字符串在控制台输出
    private static void convert(int i, Function<Integer, String> fun) {
        String s = fun.apply(i);
        System.out.println(s);
    }

    // 定义一个方法，把一个字符串转换为int类型，把int类型的数据加上一个整数之后，转为字符串在控制台输出
    private static void convert(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        String str = fun1.andThen(fun2).apply(s);
        System.out.println(str);
    }
}
