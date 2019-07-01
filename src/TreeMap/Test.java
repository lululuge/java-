package TreeMap;


import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        // 统计字符串中各个字符出现的次数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        // 字符串转为字符数组
        char[] chs = line.toCharArray();
        // 创建一个空集合
        TreeMap<Character, Integer> tm = new TreeMap<>();

        // 遍历字符数组
        for (char ch : chs) {
            Integer i =  tm.get(ch);
            if (i == null) {
                tm.put(ch, 1);
            }
            else {
                i++;
                tm.put(ch, i);
            }
        }

        // 定义字符串缓冲区
        StringBuilder sb = new StringBuilder();
        // 遍历集合
        Set<Character> set = tm.keySet();
        for (Character key : set) {
            sb.append(key).append("(").append(tm.get(key)).append(")");
        }
        System.out.println(sb.toString());

    }
}
