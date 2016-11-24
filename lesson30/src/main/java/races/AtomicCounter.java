package races;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {

    private AtomicInteger value = new AtomicInteger();

    public void increment() {
        value.incrementAndGet();
    }

    public void decrement() {
        value.decrementAndGet();
    }

    public int getValue() {
        return value.get();
    }
}
