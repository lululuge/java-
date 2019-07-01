package Map学习.基本方法;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        // map集合的遍历
        Map<String, String> map = new HashMap<String, String>();
        map.put("文章", "马伊琍");
        map.put("黄晓明", "杨颖");
        map.put("周杰伦", "昆凌");
        map.put("刘恺威", "杨幂");

        // 遍历1
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(key + ":" + map.get(key));
        }

        // 遍历2
        // 获取键值对对象
        Set<Map.Entry<String, String>> set1 = map.entrySet();
        for (Map.Entry<String, String> me : set1) {
            System.out.println(me.getKey() + ":" + me.getValue());
        }
    }
}
