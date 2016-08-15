public class AndOrTest {

    public static void main(String[] args) {

        int a = 0;
        int b = 5;

        if (true || true) {
            //true
        } else {
            //false
        }

        if (firstCondition(a, b) && secondCondition(b)) {
            System.out.println("asdf");
        } else {
            System.out.println("asdfdasf");
        }
    }

    public static boolean firstCondition(int t, int z) {
        System.out.println("firstCondition");
        boolean result = (t == z);
        return result;
    }

    public static boolean secondCondition(int c) {
        System.out.println("secondCondition");
        return (c > 3);
    }
}
