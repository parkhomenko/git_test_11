package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<Integer> filtered = new ArrayList<>();

        numbers.stream()
                .filter(e -> e % 2 == 0)
                .peek(e -> filtered.add(e)) //lazy forEach
                .forEach(e -> System.out.println(e));

        System.out.println(filtered);
    }
}
