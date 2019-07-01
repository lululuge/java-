package HashMap.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
        lhm.put("1", "jack");
        lhm.put("2", "tom");
        lhm.put("2", "tom");
        lhm.put("3", "jerry");
        lhm.put("3", "jerry");

        Set<String> set = lhm.keySet();
        for (String key : set) {
            System.out.println(key + "---" + lhm.get(key));
        }
    }
}
