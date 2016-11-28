package counting;

public class ThreadedCounting {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Counting counting = new Counting(counter);
        Thread th1 = new Thread(counting);
        Thread th2 = new Thread(counting);
        Thread th3 = new Thread(counting);
        th1.setName("0");
        th2.setName("1");
        th3.setName("2");
        th1.start();
        th2.start();
        th3.start();

        try {
            th1.join();
            th2.join();
            th3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Counting implements Runnable {

    private Counter counter;

    public Counting(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (!counter.finished()) {
            synchronized (this) {
                int currentValue = counter.getValue() % 3;
                int currentThread = Integer.parseInt(Thread.currentThread().getName());
                if (currentValue == currentThread && !counter.finished()) {
                    counter.count();
                    System.out.println(Thread.currentThread().getName() +
                            " - " + counter.getValue());
                    this.notifyAll();
                } else {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}