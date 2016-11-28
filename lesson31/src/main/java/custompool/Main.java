package custompool;

public class Main {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int processors = runtime.availableProcessors();

        ThreadPool threadPool = new ThreadPool(processors);

        Task task = new Task();
        Task task1 = new Task();
        Task task2 = new Task();
        Task task3 = new Task();

        threadPool.execute(task);
        threadPool.execute(task1);
        threadPool.execute(task2);
        threadPool.execute(task3);

        threadPool.stopAll();
    }
}

class Task implements Runnable {

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}