package Lambda表达式.Stream流.收集操作方法;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {
    public static void main(String[] args) {
        // 收集到List集合
        List<String> list = new ArrayList<String>();
        list.add("林青霞");
        list.add("林心如");
        list.add("邓超");
        list.add("陆昝");
        List<String> names = list.stream().filter(s -> s.length() == 3).collect(Collectors.toList());
        for (String s : names) {
            System.out.println(s);
        }

        // 收集到set集合
        Set<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        Set<Integer> ages = set.stream().filter(i -> i > 20).collect(Collectors.toSet());
        for (int a : ages) {
            System.out.println(a);
        }

        // 收集到Map集合
        String[] strArray = {"林青霞,30", "张曼玉,35", "王祖贤,33", "柳岩,25"};
        // 获取年龄大于28的字符串组成的流
        Stream<String> arrayStream = Stream.of(strArray).filter(s -> Integer.parseInt(s.split(",")[1]) > 28);
        // 将上面获取的数据收集到Map集合中
        Map<String, Integer> map = arrayStream.collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key + ":" + map.get(key));
        }
    }

}
