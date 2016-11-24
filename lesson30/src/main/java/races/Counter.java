package races;

public class Counter {

    private int value;
    private Object lock = new Object();
    private Object lock2 = new Object();

    public void increment() {
        //synchronized (lock) {
        //synchronized (this) {
        synchronized (Counter.class) {
            value++;
        }
    }

    public void decrement() {
        //synchronized (lock) {
        //synchronized (this) {
        synchronized (Counter.class) {
            value--;
        }
    }

    public int getValue() {
        return value;
    }
}
