package TreeMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Test5 {
    public static void main(String[] args) {
        // 多层嵌套
        // 创建大集合
        HashMap<String, HashMap<String, ArrayList<Student>>> hm = new HashMap<String, HashMap<String, ArrayList<Student>>>();
        // 创建北京校区数据
        HashMap<String, ArrayList<Student>> bjHm = new HashMap<String, ArrayList<Student>>();
        ArrayList<Student> arrayList1 = new ArrayList<Student>();
        Student s11 = new Student("林青霞", 27);
        Student s12 = new Student("祖冲之", 50);
        arrayList1.add(s11);
        arrayList1.add(s12);
        bjHm.put("基础班" , arrayList1);
        ArrayList<Student> arrayList2 = new ArrayList<Student>();
        Student s21 = new Student("青霞", 37);
        Student s22 = new Student("冲之", 45);
        arrayList2.add(s21);
        arrayList2.add(s22);
        bjHm.put("就业班", arrayList2);
        hm.put("北京校区", bjHm);
        // 创建南京校区数据n
        HashMap<String, ArrayList<Student>> njHm = new HashMap<String, ArrayList<Student>>();
        ArrayList<Student> arrayList3 = new ArrayList<Student>();
        Student s31 = new Student("詹姆斯", 27);
        Student s32 = new Student("林书豪", 50);
        arrayList3.add(s31);
        arrayList3.add(s32);
        njHm.put("基础班" , arrayList1);
        ArrayList<Student> arrayList4 = new ArrayList<Student>();
        Student s41 = new Student("库兹马", 37);
        Student s42 = new Student("戴维斯", 45);
        arrayList4.add(s41);
        arrayList4.add(s42);
        njHm.put("就业班", arrayList2);
        hm.put("南京校区", njHm);

        // 遍历
//        System.out.println(hm);
        Set<String> set = hm.keySet();
        for (String key : set) {
            System.out.println(key);
            HashMap<String, ArrayList<Student>> value = hm.get(key);
//            System.out.println(hm.get(key));
            Set<String> set1 = value.keySet();
            for (String key1 : set1) {
                System.out.println("\t" + key1);
//                System.out.println(hm.get(key).get(key1))
                ArrayList<Student> arrayList = value.get(key1);
                for (Student s : arrayList) {
                    System.out.println("\t\t" + s.getName() + ":" + s.getAge());
                }

            }
        }
    }
}
