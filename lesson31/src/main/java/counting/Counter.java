package counting;

public class Counter {
    private int value;

    public void count() {
        value++;
    }

    public int getValue() {
        return value;
    }

    public boolean finished() {
        return value >= 100;
    }
}
