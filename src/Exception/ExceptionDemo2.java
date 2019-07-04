package Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        String s = "2014-12-24";
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
        try {
            Date d = sdf.parse(s);
            System.out.println(d);
        }
        catch (ParseException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("over");


    }
}
