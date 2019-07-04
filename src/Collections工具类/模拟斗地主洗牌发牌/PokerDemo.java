package Collections工具类.模拟斗地主洗牌发牌;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
        // 创建一个牌盒
        ArrayList<String> arrayList = new ArrayList<String>();
        // 创建花色数组
        String[] colors = {"♠", "♥", "♣", "♦"};
        // 创建点数数组
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        // 生成一副新牌
        for (String color : colors) {
            for (String number : numbers) {
                arrayList.add(color.concat(number));
            }
        }
        arrayList.add("小王");
        arrayList.add("大王");
//        System.out.println(arrayList);
        // 洗牌
        Collections.shuffle(arrayList);
        // 发牌,取三张为底牌
        ArrayList<String> player1 = new ArrayList<String>();
        ArrayList<String> player2 = new ArrayList<String>();
        ArrayList<String> player3 = new ArrayList<String>();
        ArrayList<String> dipai = new ArrayList<String>();

        for (int i = 0; i < arrayList.size(); i++) {
            if (i >= arrayList.size() - 3) {
                dipai.add(arrayList.get(i));
            }
            else if (i % 3 == 0) {
                player1.add(arrayList.get(i));
            }
            else if (i % 3 == 1) {
                player2.add(arrayList.get(i));
            }
            else if (i % 3 == 2) {
                player3.add(arrayList.get(i));
            }
        }

        // 看牌
        lookPoker("玩家1", player1);
        lookPoker("玩家2", player2);
        lookPoker("玩家3", player3);
        lookPoker("底牌", dipai);



    }
    // 定义一个看牌功能
    public static void lookPoker(String name, ArrayList<String> array) {
        System.out.println(name + "的牌是：");
        for (String s : array) {
            System.out.print(s);
        }
        System.out.println();
    }
}
