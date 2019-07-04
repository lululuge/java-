package Exception;
// 异常
public class ExceptionDemo {
    public static void main(String[] args) {
       int a = 10;
       int b = 0;
       int[] arr = {1, 2, 3};
       try {
           System.out.println(a / b);
           System.out.println(arr[3]);
       }
       catch (ArithmeticException e) {
           System.out.println(e.getMessage());
           System.out.println(e.toString());
           e.printStackTrace();
       }
       catch (ArrayIndexOutOfBoundsException e) {
           e.printStackTrace();
       }
       catch (Exception e) {
           System.out.println(e.toString());
       }

       System.out.println("over");
    }
}
