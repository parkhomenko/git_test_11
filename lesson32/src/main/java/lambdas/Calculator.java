package lambdas;

import java.util.function.BinaryOperator;

public class Calculator {

    private int o1;
    private int o2;

    public Calculator(int o1, int o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    /*
    public int calculate(Operation operation) {
        return operation.proceed(o1, o2);
    }
    */

    public int calculate(BinaryOperator<Integer> operator) {
        return operator.apply(o1, o2);
    }
}
