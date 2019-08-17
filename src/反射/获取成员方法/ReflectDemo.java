package 反射.获取成员方法;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 获取class对象
        Class<?> c = Class.forName("反射.Student");
        // 获取无参构造方法
        Constructor<?> con = c.getDeclaredConstructor();
        Object obj = con.newInstance();
        // 调用method1（）
        Method m1 = c.getDeclaredMethod("method1");
        m1.invoke(obj);
        // 调用method2()
        Method m2 = c.getDeclaredMethod("method2", String.class);
        m2.invoke(obj, "林青霞");
        // 调用method3()
        Method m3 = c.getDeclaredMethod("method3", String.class, int.class);
        String s = (String) m3.invoke(obj, "林青霞", 30);
        System.out.println(s);
        // 调用function()
        Method f = c.getDeclaredMethod("function");
        f.setAccessible(true);
        f.invoke(obj);
    }
}
