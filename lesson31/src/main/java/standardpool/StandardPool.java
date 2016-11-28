package standardpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StandardPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);

        service.execute(new MyTask());
        service.execute(new MyTask());
        service.execute(new MyTask());
        service.execute(new MyTask());
        service.execute(new MyTask());
        service.execute(new MyTask());
        service.execute(new MyTask());
    }
}
