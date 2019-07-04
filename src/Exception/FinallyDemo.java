package Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FinallyDemo {
    public static void main(String[] args) {
        String s = "2014-12-24";
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
        Date d = null;
        try {
            d = sdf.parse(s);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println(d);
        }
        System.out.println(d);
    }
}
