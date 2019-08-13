package IO流.对象序列化流;

import java.io.*;

public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 将对象序列化
        write();
        // 反序列化
        read();
    }

    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
        Student s = (Student) ois.readObject();
        System.out.println(s.getName() + "," + s.getAge());
        ois.close();
    }

    private static void write() throws IOException{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
        Student s = new Student("luzan", 23);
        oos.writeObject(s);
        oos.close();
    }

}
