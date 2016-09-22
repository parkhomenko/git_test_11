package com.hillel.polymorphism.oop;

public class Calculator {

    public Integer calculate(int op1, int op2, String operation) {
        switch (operation) {
            case "+":
                return op1 + op2;
            case "-":
                return op1 - op2;
            case "*":
                return op1 * op2;
            case "/":
                return op1 / op2;
            default:
                return null;
        }
    }
}
