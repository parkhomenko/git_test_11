package basics;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread threadCounter = new Thread(new ThreadCounter());
        threadCounter.setName("Counter");
        threadCounter.setPriority(Thread.NORM_PRIORITY);
        threadCounter.start();

        threadCounter.join();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class ThreadCounter implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1); //in ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}