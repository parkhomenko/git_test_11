package races;

public class RacesTest {
    public static void main(String[] args) throws InterruptedException {

        //Counter counter = new Counter();
        AtomicCounter counter = new AtomicCounter();

        Thread inc = new Thread(new Incrementor(counter));
        Thread dec = new Thread(new Decrementor(counter));

        inc.start();
        dec.start();

        inc.join();
        dec.join();

        System.out.println(counter.getValue());
    }
}
