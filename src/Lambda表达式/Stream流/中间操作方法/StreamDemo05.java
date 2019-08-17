package Lambda表达式.Stream流.中间操作方法;

import java.util.ArrayList;

public class StreamDemo05 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("10");
        arrayList.add("20");
        arrayList.add("30");
        arrayList.add("40");
        arrayList.add("50");

        // 将集合中的字符串数据转换为整数并输出
//        arrayList.stream().map(Integer::parseInt).forEach(System.out::println);
        // 将集合中的字符串数据转换为整数并求和
        int sum = arrayList.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }
}
