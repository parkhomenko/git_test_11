public class SimpleIf {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        int max = b;

        if (a > b) {
            max = a;
        }

        System.out.println("Max: " + max);

        a = 45;
        b = 55;

        if (a == b) {
            max = a;
        } else {
            max = b;
        }

        max = (a > b) ? a : b;
    }
}
