package IO流.properties.作为集合的特有方法;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo01 {
    public static void main(String[] args) {
        // 创建集合对象
        Properties prop = new Properties();
        // 存储元素
        prop.put("001", "luzan");
        prop.put("002", "tom");
        prop.put("003", "jack");
        // 遍历集合
        Set<Object> keySet = prop.keySet();
        for (Object key : keySet) {
            Object value = prop.get(key);
            System.out.println(key + ":" + value);
        }
    }
}
