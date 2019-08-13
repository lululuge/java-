package IO流.properties.游戏次数案例;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        // 从game.txt读取数据到properties集合
        Properties prop = new Properties();
        FileReader fr = new FileReader("C:\\Users\\34759\\Desktop\\java学习（idea）\\src\\IO流\\properties\\游戏次数案例\\game.txt");
        prop.load(fr);
        fr.close();
        // 通过properties集合获取到玩游戏的次数
        String count = prop.getProperty("count");
        int num = Integer.parseInt(count);
        // 判断次数是否达到三次
        if (num >= 3) {
            System.out.println("想继续玩请充值");
        }
        else {
            // 玩游戏
            GuessNumber.start();
            // 游戏次数加1
            num++;
            // 修改集合值
            prop.setProperty("count", String.valueOf(num));
            // 修改文件参数
            FileWriter fw = new FileWriter("C:\\Users\\34759\\Desktop\\java学习（idea）\\src\\IO流\\properties\\游戏次数案例\\game.txt");
            prop.store(fw, null);
            fw.close();
        }
    }
}
