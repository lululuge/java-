package Lambda表达式.函数式接口.函数式接口作为方法的返回值;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        // 构造使用场景

        // 创建一个列表存储元素
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("a2r");
        arrayList.add("bf");
        arrayList.add("saddahj");
        arrayList.add("luzan");
        System.out.println("排序前" + arrayList);
        Collections.sort(arrayList);
        System.out.println("自然排序后" + arrayList);
        // 比较器排序
        Collections.sort(arrayList, getComparator());
        System.out.println("比较器排序后" + arrayList);

    }
    private static Comparator<String> getComparator() {
        // 匿名内部类方式实现
//        return new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                // 按照长度从小到大排列
//                return s1.length() - s2.length();
//            }
//        };

        // Lambda表达式改写
        return (s1, s2) -> s1.length() - s2.length();
    }
}
