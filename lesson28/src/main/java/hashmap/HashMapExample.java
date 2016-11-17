package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("first", 1);
        map.put("second", 2);
        map.put("third", 3);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
