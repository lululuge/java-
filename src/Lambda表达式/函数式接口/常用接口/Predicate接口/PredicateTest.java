package Lambda表达式.函数式接口.常用接口.Predicate接口;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        String[] strArray = {"林青霞,30", "柳岩,34", "张曼玉,35", "貂蝉,31", "王祖贤,33"};
        // 创建一个新的列表
        ArrayList<String> arrayList = new ArrayList<String>();
        // 遍历已给出的字符串数组
        for (String str : strArray) {
            if (checkString(str, s -> s.split(",")[0].length() > 2, s -> Integer.parseInt(s.split(",")[1]) > 33)) {
                arrayList.add(str);
            }
        }
        for (String data : arrayList) {
            System.out.println(data);
        }


    }

    private static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
            return pre1.and(pre2).test(s);

    }
}
