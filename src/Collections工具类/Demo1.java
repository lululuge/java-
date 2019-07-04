package Collections工具类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 基本方法
public class Demo1 {
    public static void main(String[] args) {
        // 创建集合对象
        List<Integer> list = new ArrayList<Integer>();
        // 添加元素
        list.add(30);
        list.add(50);
        list.add(20);
        list.add(10);
        list.add(80);
        System.out.println(list);
        // 排序
        Collections.sort(list);
        System.out.println(list);
        // 二分查找
        System.out.println(Collections.binarySearch(list, 30));
        Collections.reverse(list);
        System.out.println(list);
        // 最大值
        System.out.println(Collections.max(list));
        //  随机置换
        Collections.shuffle(list);
        System.out.println(list
        );
    }
}
