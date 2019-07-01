package TreeMap;

import java.util.HashMap;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        // HashMap的嵌套
        // 创建集合
        HashMap<String, HashMap<String, Integer>> hm = new HashMap<String, HashMap<String, Integer>>();
        HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
        HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
        hm1.put("詹姆斯", 20);
        hm1.put("戴维斯", 25);
        hm2.put("安东尼", 26);
        hm2.put("林书豪", 27);
        hm.put("湖人", hm1);
        hm.put("篮网", hm2);
        System.out.println(hm);
        Set<String> set = hm.keySet();
        for (String key : set) {
//            System.out.println(hm.get(key));
            HashMap<String, Integer> hmValue = hm.get(key);
            Set<String> set1 = hmValue.keySet();
            for (String key1 : set1) {
                System.out.println(key1 + ":" + hmValue.get(key1));
            }
        }
    }
}
