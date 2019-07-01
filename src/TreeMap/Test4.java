package TreeMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        // ArrayList嵌套HashMap
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> hm1 = new HashMap<String, String>();
        HashMap<String, String> hm2 = new HashMap<String, String>();
        HashMap<String, String> hm3 = new HashMap<String, String>();

        hm1.put("周瑜", "小乔");
        hm1.put("吕布", "貂蝉");
        arrayList.add(hm1);
        hm2.put("郭靖", "黄蓉");
        hm2.put("杨过", "小龙女");
        arrayList.add(hm2);
        hm3.put("令狐冲", "任盈盈");
        hm3.put("林平之", "岳灵珊");
        arrayList.add(hm3);

        // 遍历
        for (HashMap<String, String> hm : arrayList) {
//            System.out.println(hm);
            Set<String> set = hm.keySet();
            for (String key : set) {
                System.out.println(key + "<=>" + hm.get(key));
            }
        }
    }
}
