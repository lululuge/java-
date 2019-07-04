package Exception.自定义异常;

import java.util.Scanner;

public class TeacherDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的分数:");
        int score = sc.nextInt();
        Teacher t = new Teacher();
        try {
            t.check(score);
        }
        catch (MyException e) {
            e.printStackTrace();
        }

    }
}
