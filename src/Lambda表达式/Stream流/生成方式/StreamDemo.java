package Lambda表达式.Stream流.生成方式;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // Map集合生成流
        Map<String, Integer> map = new HashMap<String, Integer>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<Integer> valueStream = map.values().stream();
        Stream<Map.Entry<String, Integer>> entryStream = map.entrySet().stream();

        // 数组
        String[] strArray = {"lu", "zan", "java"};
        Stream<String> strArrayStream1 = Stream.of(strArray);
        Stream<String> strArrayStream2 = Stream.of("lu", "zan", "java");
    }
}
