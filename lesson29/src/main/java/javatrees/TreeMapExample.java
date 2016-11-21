package javatrees;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<Integer, String>();
        map.put(5, "five");
        map.put(13, "five");
        map.put(1, "five");
        map.put(2, "five");
        map.put(15, "five");
        map.put(23, "five");
        map.put(18, "five");
        map.put(19, "five");
        map.put(4, "five");
        map.put(19, "ninetinth");

        System.out.println(map);
    }
}
