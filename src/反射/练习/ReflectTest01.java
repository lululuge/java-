package 反射.练习;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // 向一个ArrayList<Integer>集合中添加一个字符串数据

        // 创建集合
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(20);
        System.out.println(arrayList);

        // 获取class对象
        Class<? extends ArrayList> c = arrayList.getClass();
        Method m = c.getMethod("add", Object.class);
        m.invoke(arrayList, "hello");
        System.out.println(arrayList);

    }
}
