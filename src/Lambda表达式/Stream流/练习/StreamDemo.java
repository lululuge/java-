package Lambda表达式.Stream流.练习;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> boyList = new ArrayList<String>();
        ArrayList<String> girlist = new ArrayList<String>();
        boyList.add("张译");
        boyList.add("邓超");
        boyList.add("张嘉译");
        boyList.add("林永健");
        boyList.add("王祖蓝");
        boyList.add("姚雪阳");
        girlist.add("林青霞");
        girlist.add("张敏");
        girlist.add("林心如");
        girlist.add("林志玲");
        girlist.add("容祖儿");
        girlist.add("孙艺珍");
        Stream<String> s1 = boyList.stream().filter(s -> s.length() == 3).limit(3);
        Stream<String> s2 = girlist.stream().filter(s -> s.startsWith("林")).skip(1);
        Stream.concat(s1, s2).map(Actor::new).forEach(actor -> System.out.println(actor.getName()));
    }
}
