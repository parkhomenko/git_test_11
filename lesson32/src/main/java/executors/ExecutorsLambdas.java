package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class ExecutorsLambdas {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);

        service.execute(() -> {
            int sum = IntStream
                    .range(0, 100)
                    .sum();

            System.out.println(sum);
        });
    }
}
