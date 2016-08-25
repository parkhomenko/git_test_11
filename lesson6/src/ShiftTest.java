public class ShiftTest {

    public static void main(String[] args) {

        int i = 11;

        long start = System.nanoTime();

        //int result = i / 2;

        for (int j = 0; j < 10000; j++) {
            int result = i / 2;
        }

        long end = System.nanoTime();

        System.out.println((end - start) / 10000 + " ms");
    }
}
