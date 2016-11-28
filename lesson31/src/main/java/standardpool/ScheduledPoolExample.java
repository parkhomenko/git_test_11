package standardpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledPoolExample {

    public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newScheduledThreadPool(4);
        service.scheduleWithFixedDelay(new MyTask(), 1, 1, TimeUnit.SECONDS);

    }
}
