public class FunctionsExample {

    public static void main(String[] args) {

        int result = add(5, 3);
        int result2 = add(5.0, 7.0);
    }

    public static int add(int op1, int op2) {
        System.out.println("In function");
        return op1 + op2;
    }

    public static int add(double op1, double op2) {
        System.out.println("In function");
        return (int) (op1 + op2);
    }
}
