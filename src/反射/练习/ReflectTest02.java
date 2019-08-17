package 反射.练习;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
    通过配置文件运行类中的方法
*/
public class ReflectTest02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 创建配置文件
        File file = new File("class.txt");
        file.createNewFile();
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write("className=反射.练习.Student");
        bw.newLine();
        bw.write("methodName=study");
        bw.flush();
        bw.close();

        // 通过反射来调用配置文件
        // 一：加载配置文件
        Properties prop = new Properties();
        FileReader fr = new FileReader(file);
        prop.load(fr);
        fr.close();

        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        // 二：用反射来使用方法
        Class<?> c = Class.forName(className);
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        Method m = c.getMethod(methodName);
        m.invoke(obj);
    }
}
