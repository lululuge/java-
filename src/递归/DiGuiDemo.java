package 递归;

import java.util.Scanner;

// 用代码实现阶乘
public class DiGuiDemo {
    public static void main(String[] args) {
        // 循环实现
//        Scanner sc = new Scanner(System.in);
////        System.out.println("请输入一个正整数：");
////        int n = sc.nextInt();
////        int result = 1;
////        while (n > 0) {
////            result *= n;
////            n--;
////        }
////        System.out.println(result);
        System.out.println(jieCheng(5));
    }

    // 递归实现
    public static int jieCheng(int n) {
        if (n ==  1) {
            return 1;
        }
        else {
            return n * jieCheng(n - 1);
        }

    }
}
