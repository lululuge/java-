package Exception.自定义异常;

public class Teacher {
    public void check(int score) throws MyException{
        if (score > 100 || score < 0) {
            throw new MyException("分数输入错误");
        }
        else {
            System.out.println("分数无误");
        }
    }
}
