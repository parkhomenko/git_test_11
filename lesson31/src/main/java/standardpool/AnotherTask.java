package standardpool;

import java.util.concurrent.Callable;

public class AnotherTask implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        Thread.sleep(5000);

        return sum;
    }
}
