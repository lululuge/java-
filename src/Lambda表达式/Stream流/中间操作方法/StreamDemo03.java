package Lambda表达式.Stream流.中间操作方法;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo03 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("林青霞");
        arrayList.add("张曼玉");
        arrayList.add("王祖贤");
        arrayList.add("柳岩");
        arrayList.add("张敏");
        arrayList.add("张无忌");
        // 取前四个数据组成一个流
        Stream<String> s1 = arrayList.stream().limit(4);
        // 跳过2个数据组成一个流
        Stream<String> s2 = arrayList.stream().skip(2);
        // 合并前两个流
//        Stream.concat(s1, s2).forEach(System.out::println);
//        System.out.println("----------");
        // 合并前两个流，并输出，字符串元素不能重复
        Stream.concat(s1, s2).distinct().forEach(System.out::println);
    }
}
