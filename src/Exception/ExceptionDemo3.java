package Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        System.out.println("开始");
        try {
            method();
        }
        catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("结束");
    }
    public static void method() throws ParseException {
        String s = "2014-12-24";
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
        Date d = sdf.parse(s);
    }
}
