package Lambda表达式.函数式接口.常用接口.Predicate接口;

import java.util.function.Predicate;

public class PredicateDemo01 {
    public static void main(String[] args) {
        boolean b1 = checkString("luzan", s -> s.length() > 8);
        System.out.println(b1);

        boolean b2 = checkString("helloworld", s -> s.length() < 8, s -> s.length() > 15);
        System.out.println(b2);
    }

    // 判断给定字符串是否满足要求,一个判断
    private static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
//        return pre.negate().test(s);
    }

    // 判断给定字符串是否满足要求,两个判断,短路与
    private static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
//        return pre1.and(pre2).test(s);
        return pre1.or(pre2).test(s);
    }

}
