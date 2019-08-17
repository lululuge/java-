package Lambda表达式.函数式接口.常用接口.Supplier接口;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        int[] arr = {23, 25, 68, 78, 100};
        int maxValue = getMax(() -> {
           int max = arr[0];
           for (int i = 1; i < arr.length; i++) {
               if (arr[i] > max) {
                   max = arr[i];
               }
           }
           return max;
        });
        System.out.println(maxValue);
    }
    private static int getMax(Supplier<Integer> sup) {
       return sup.get();
    }
}
