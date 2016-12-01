package lambdas;

@FunctionalInterface
public interface Operation {

    int proceed(int operand1, int operand2);

}
