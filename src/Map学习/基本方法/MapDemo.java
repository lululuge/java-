package Map学习.基本方法;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        // 创建集合对象
        Map<String, String> map = new HashMap<String, String>();
        map.put("文章", "马伊琍");
        map.put("黄晓明", "杨颖");
        map.put("周杰伦", "昆凌");
        map.put("刘恺威", "杨幂");
        System.out.println(map);
        map.remove("黄晓明");
        map.remove("陆昝");
        System.out.println(map);
    }
}
