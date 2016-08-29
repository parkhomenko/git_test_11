package org.hillel.courses.calc;

public class Calculator {

    public static void main(String[] args) {

        int result = addition(5, 3);

        System.out.println("The result of the addition is " + result);
    }

    public static int addition(int operand1, int operand2) {
        return operand1 + operand2;
    }

    public static int subtraction(int operand1, int operand2) {
        return operand1 - operand2;
    }
}
