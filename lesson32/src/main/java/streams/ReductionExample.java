package streams;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        int sum = list.stream()
                .filter(e -> e % 2 == 1) // lazy
                .reduce(0, (e1, e2) -> e1 + e2);

        System.out.println(sum);
    }
}
