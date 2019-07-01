package TreeMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        // HashMap嵌套ArrayList
        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        arrayList1.add("吕布");
        arrayList1.add("周瑜");
        hm.put("三国演义" ,arrayList1);

        arrayList2.add("令狐冲");
        arrayList2.add("林平之");
        hm.put("笑傲江湖" ,arrayList2);

        arrayList3.add("郭靖");
        arrayList3.add("杨过");
        hm.put("神雕侠侣" ,arrayList3);

        System.out.println(hm);

        // 遍历
        Set<String> set = hm.keySet();
        for (String key : set) {
//            System.out.println(hm.get(key));
            ArrayList<String> value = hm.get(key);
            System.out.println(key);
            for (int i = 0; i < value.size(); i++) {
                System.out.println("\t" + value.get(i));
            }
        }

    }
}
