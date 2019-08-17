package Lambda表达式.函数式接口.常用接口.Function接口;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        String str = "林青霞,33";
        convert(str, s -> s.split(",")[1], s -> Integer.parseInt(s), i -> i + 70);
    }

    private static void convert(String s, Function<String, String> fun1, Function<String, Integer> fun2, Function<Integer, Integer> fun3) {
        int i = fun1.andThen(fun2).andThen(fun3).apply(s);
        System.out.println("最终结果为:" + i);
    }
}
