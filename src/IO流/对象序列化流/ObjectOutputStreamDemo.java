package IO流.对象序列化流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("oos.txt"));
        Student s = new Student("luzan", 23);
        oos.writeObject(s);
        oos.close();
    }
}
