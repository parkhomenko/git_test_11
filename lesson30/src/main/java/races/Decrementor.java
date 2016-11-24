package races;

public class Decrementor implements Runnable {

    //private Counter counter;
    private AtomicCounter counter;

    public Decrementor(AtomicCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.decrement();
        }
    }
}
