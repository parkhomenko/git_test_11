public class AbsFunction {

    public static void main(String[] args) {

        int a = 7;

        int result = abs(a);

        System.out.println();
    }

    public static int abs(int number) {
        int result;

        if (number > 0) {
            result = number;
        } else {
            result = -number;
        }

        return result;
    }

    public static int abs1(int number) {

        if (number > 0) {
            return number;
        }

        return -number;
    }

    public static int abs2(int number) {

        return (number < 0) ? -number : number;
    }
}
