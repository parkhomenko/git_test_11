package standardpool;

public class MyTask implements Runnable {

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
