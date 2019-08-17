package Lambda表达式.Stream流.中间操作方法;

import java.util.ArrayList;

public class StreamDemo02 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("林青霞");
        arrayList.add("张曼玉");
        arrayList.add("王祖贤");
        arrayList.add("柳岩");
        arrayList.add("张敏");
        arrayList.add("张无忌");
        // 取前三个元素并输出
        arrayList.stream().limit(3).forEach(System.out::println);
        System.out.println("------------");
        // 跳过3个元素，输出剩下的元素
        arrayList.stream().skip(3).forEach(System.out::println);
        System.out.println("------------");
        // 跳过两个,输出剩余元素中的前两个
        arrayList.stream().skip(2).limit(2).forEach(System.out::println);
    }
}
