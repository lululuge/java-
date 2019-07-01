package HashMap;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(27, "tom");
        hm.put(28, "jack");
        hm.put(29, "jerry");
        hm.put(30, "jason");
        // 遍历
        Set<Integer> set = hm.keySet();
        for (Integer key : set) {
            System.out.println(key + ":" + hm.get(key));
        }
    }
}
