package Map学习.基本方法;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        // 获取功能
        Map<String, String> map = new HashMap<String, String>();
        map.put("文章", "马伊琍");
        map.put("黄晓明", "杨颖");
        map.put("周杰伦", "昆凌");
        map.put("刘恺威", "杨幂");
        System.out.println(map.get("文章"));
        System.out.println(map.get("陆昝"));
        // 获取所有键的集合
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(key);
        }

        // 获取所有值的集合
        Collection<String> collection = map.values();
        for (String value : collection) {
            System.out.println(value);
        }




    }
}
