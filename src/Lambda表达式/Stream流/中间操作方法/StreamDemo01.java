package Lambda表达式.Stream流.中间操作方法;

import java.util.ArrayList;

public class StreamDemo01 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("林青霞");
        arrayList.add("张曼玉");
        arrayList.add("王祖贤");
        arrayList.add("柳岩");
        arrayList.add("张敏");
        arrayList.add("张无忌");
        // 输出以张开头的数据
        arrayList.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);
    }
}
