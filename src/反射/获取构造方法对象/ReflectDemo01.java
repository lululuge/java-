package 反射.获取构造方法对象;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 获取Class对象
        Class<?> c = Class.forName("反射.Student");
        // 获取构造方法对象
        Constructor<?> con = c.getDeclaredConstructor(String.class, int.class, String.class);
        // 生成对象
        Object obj = con.newInstance("林青霞", 30, "西安");
        System.out.println(obj);
    }
}
