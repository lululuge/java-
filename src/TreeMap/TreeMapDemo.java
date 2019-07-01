package TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<String, String>();
        tm.put("001", "詹姆斯");
        tm.put("002", "戴维斯");
        tm.put("003", "库兹马");
        tm.put("003", "库兹马");
        tm.put("004", "库兹马");

        Set<String> set = tm.keySet();
        for (String key : set) {
            System.out.println(key + ":" + tm.get(key));
        }

    }
}
