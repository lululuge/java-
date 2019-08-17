package Lambda表达式.函数式接口.常用接口.Consumer接口;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        String[] strArray = {"林青霞,30", "张曼,35", "王祖贤,33"};
        printInfo(strArray, str -> System.out.print("姓名：" + str.split(",")[0]), str -> System.out.println(",年龄：" + str.split(",")[1]));
    }

    private static void printInfo(String[] strArray, Consumer<String> con1, Consumer<String> con2) {
        for (String str : strArray) {
            con1.andThen(con2).accept(str);
        }
    }
}
