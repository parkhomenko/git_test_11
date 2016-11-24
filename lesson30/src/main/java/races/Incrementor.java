package races;

public class Incrementor implements Runnable {

    //private Counter counter;
    private AtomicCounter counter;

    public Incrementor(AtomicCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
