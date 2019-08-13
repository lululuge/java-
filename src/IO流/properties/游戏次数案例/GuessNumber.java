package IO流.properties.游戏次数案例;

import java.util.Random;
import java.util.Scanner;

// 自定义一个猜数字的游戏类
public class GuessNumber {
    private GuessNumber() {
    }

    public static void start() {
        Random r = new Random();
        // 产生一个1-100的随机数字
        int num = r.nextInt(100) + 1;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你猜测的数字：");
            int guessNum = sc.nextInt();
            if (guessNum > num) {
                System.out.println("猜大了！");
            }
            else if (guessNum < num) {
                System.out.println("猜小了");
            }
            else {
                System.out.println("猜对了\n游戏结束!");
                break;
            }
        }

    }
}
