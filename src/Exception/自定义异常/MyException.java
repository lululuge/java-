package Exception.自定义异常;

public class MyException extends Exception {
    // 构造方法
    public MyException() {
        super();
    }
    public MyException(String message) {
        super(message);
    }
}
