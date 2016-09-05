import org.hillel.complexity.Counter;

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter(100);
        int result = counter.countInCycle();

        System.out.println(result);
    }
}
