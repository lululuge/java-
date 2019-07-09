package 递归;

import java.util.Scanner;

// 斐波那契数列,1,1,3,5,8,11...
public class Test1 {
    public static void main(String[] args) {
        // 实现1
        int a = 1;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要显示的月数：");
        int n = sc.nextInt();
        for (int i = 0; i < n - 2; i++) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println(b);
        System.out.println(fib(10));
    }

    // 实现2，递归方法

    public static int fib(int m) {
        if (m == 1 || m == 2) {
            return 1;
        }
        else {
            return fib(m - 1) + fib(m - 2);
        }
    }
}
