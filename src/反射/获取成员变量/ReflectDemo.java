package 反射.获取成员变量;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        // 获取class对象
        Class<?> c = Class.forName("反射.Student");
        // 通过无参构造方法创建对象
        Constructor<?> con = c.getDeclaredConstructor();
        Object obj = con.newInstance();
        System.out.println(obj);
        // 给私有变量name赋值
        Field nameField = c.getDeclaredField("name");
        // 暴力反射
        nameField.setAccessible(true);
        nameField.set(obj, "林青霞");
        System.out.println(obj);
        // 给age赋值
        Field ageFiled = c.getDeclaredField("age");
        ageFiled.setAccessible(true);
        ageFiled.set(obj, 30);
        // 给address赋值
        Field addressField = c.getDeclaredField("address");
        addressField.set(obj, "西安");
        System.out.println(obj);
    }
}
