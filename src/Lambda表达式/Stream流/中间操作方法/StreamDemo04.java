package Lambda表达式.Stream流.中间操作方法;

import java.util.ArrayList;

public class StreamDemo04 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("linqingxia");
        arrayList.add("zhangmanyu");
        arrayList.add("liuyan");
        arrayList.add("zhangmin");
        arrayList.add("zhangwuji");
        // 按照字母顺序进行排序
        arrayList.stream().sorted().forEach(System.out::println);
        System.out.println("-----------");
        // 按照字符串长度进行排序
//        arrayList.stream().sorted((s1, s2) -> s1.length() - s2.length()).forEach(System.out::println);
        arrayList.stream().sorted((s1, s2) -> {
            int num = s1.length() - s2.length();
            int num2 = num == 0 ? s1.compareTo(s2) : num;
            return num2;
        }).forEach(System.out::println);
    }

}
