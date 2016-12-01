package lambdas;

public class Addition implements Operation {

    @Override
    public int proceed(int operand1, int operand2) {
        return operand1 + operand2;
    }
}
