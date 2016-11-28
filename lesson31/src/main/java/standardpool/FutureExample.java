package standardpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(4);
        Future<Integer> result = service.submit(new AnotherTask());
        int sum = result.get();

        Future<Integer> result2 = service.submit(new AnotherTask());
        int sum2 = result2.get();

        Future<Integer> result3 = service.submit(new AnotherTask());
        int sum3 = result3.get();

        Future<Integer> result4 = service.submit(new AnotherTask());
        int sum4 = result4.get();

        System.out.println(sum);
    }
}
