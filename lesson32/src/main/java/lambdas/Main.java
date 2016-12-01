package lambdas;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(5, 3);

        /*
        Operation operation = new Addition();
        int result = calculator.calculate(operation);

        System.out.println(result);

        Operation operation2 = new Operation() {
            @Override
            public int proceed(int operand1, int operand2) {
                return operand1 - operand2;
            }
        };

        int result2 = calculator.calculate(operation2);

        System.out.println(result2);

        Operation operation3 = (operand1, operand2) -> operand1 * operand2;
        int result3 = calculator.calculate(operation3);
        System.out.println(result3);
        */

        int result4 = calculator.calculate((o1, o2) -> o1 / o2);
        System.out.println(result4);
    }
}
