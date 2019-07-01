package HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> hs = new HashMap<String, String>();
        hs.put("小前锋", "杜兰特");
        hs.put("中锋", "小乔丹");
        hs.put("后卫", "拉塞尔");
        hs.put("分卫", "勒维尔");

        // 遍历
        Set<String> set = hs.keySet();
        for (String key : set) {
            System.out.println(key + ":" + hs.get(key));
        }
    }
}
