package IO流.对象序列化流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
        Student s = (Student) ois.readObject();
        System.out.println(s.getName() + "," + s.getAge());
    }
}
