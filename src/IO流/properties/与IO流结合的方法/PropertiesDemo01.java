package IO流.properties.与IO流结合的方法;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo01 {
    public static void main(String[] args) throws IOException {
//        // 将集合中的数据保存到文件
//        myStore();
        // 将文件中的数据加载到集合
        myLoad();
    }

    private static void myLoad() throws IOException{
        Properties prop = new Properties();

        FileReader fr = new FileReader("fw.txt");
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }

    private static void myStore() throws IOException{
        Properties prop = new Properties();
        prop.setProperty("001", "tom");
        prop.setProperty("002", "jerry");
        prop.setProperty("003", "jack");

        FileWriter fw = new FileWriter("fw.txt");
        prop.store(fw, null);
        fw.close();
    }
}
