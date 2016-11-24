package locks;

public class Lock {

    private boolean locked = false;

    public void lock() {
        while (locked) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        locked = true;
    }

    public void unlock() {
        locked = false;
        notify();
    }
}
