package Lambda表达式.Stream流.体验Stream流;

import java.util.ArrayList;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        arrayList.add("林青霞");
        arrayList.add("张曼玉");
        arrayList.add("王祖贤");
        arrayList.add("柳岩");
        arrayList.add("张敏");
        arrayList.add("张无忌");
        for (String s : arrayList) {
            if (s.substring(0, 1).equals("张")) {
                list1.add(s);
            }
        }
        for (String ss : list1) {
            if (ss.length() == 3) {
                list2.add(ss);
            }
        }
//        System.out.println(list1);
        System.out.println(list2);
        System.out.println("---------");
        // Stream流改写
        arrayList.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);
    }
}
