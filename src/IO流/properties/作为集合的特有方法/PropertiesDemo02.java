package IO流.properties.作为集合的特有方法;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo02 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("001", "tom");
        prop.setProperty("002", "jerry");
        prop.setProperty("003", "jack");

        Set<String> keySet = prop.stringPropertyNames();
        for (String key : keySet) {
            System.out.println(key + ":" + prop.getProperty(key));
        }
    }
}
