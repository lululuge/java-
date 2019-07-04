package Collections工具类.模拟斗地主洗牌发牌;

import java.util.*;

public class PokerDemo2 {
    public static void main(String[] args) {
        // 创建一个HashMap集合，key为编号（0-53），value为牌
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        // 创建一个ArrayList集合，存入牌的编号
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        // 创建花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        // 创建点数数组
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        // 按从小到大的顺序将带花色的牌存入HashMap集合中,同时编号存入ArrayList中
        Integer index = 0;
        for (String number : numbers) {
            for (String color : colors) {
                hm.put(index, color.concat(number));
                arrayList.add(index);
                index++;
//                System.out.println(color.concat(number));

            }
        }

        // 装入大小王
        hm.put(52, "小王");
        hm.put(53, "大王");
        arrayList.add(52);
        arrayList.add(53);
//        System.out.println(hm);
//        System.out.println(arrayList);

        // 洗牌,洗的是编号
        Collections.shuffle(arrayList);
//        System.out.println(arrayList);
        // 将洗过之后的牌组，分发给三个玩家，并预留三张底牌
        // 创建四个TreeSet集合，存储玩家牌和底牌(存的是编号)
        TreeSet<Integer> player1 = new TreeSet<Integer>();
        TreeSet<Integer> player2 = new TreeSet<Integer>();
        TreeSet<Integer> player3 = new TreeSet<Integer>();
        TreeSet<Integer> dipai = new TreeSet<Integer>();
        for (Integer i : arrayList) {
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
        lookPoker("玩家一", player1, hm);
        lookPoker("玩家二", player2, hm);
        lookPoker("玩家三", player3, hm);
        lookPoker("底牌", dipai, hm);

    }
    // 定义一个看牌功能
    public static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
        System.out.println(name + "的牌是：");
        for (Integer key : ts) {
            System.out.print(hm.get(key));
        }
        System.out.println();
    }
}
