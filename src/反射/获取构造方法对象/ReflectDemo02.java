package 反射.获取构造方法对象;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("反射.Student");
        Constructor<?> con = c.getDeclaredConstructor(String.class);
        // 暴力反射
        con.setAccessible(true);
        Object obj = con.newInstance("luzan");
        System.out.println(obj);
    }
}
