package com.hillel.polymorphism.oop;

public class MultiplicationOperation implements Operation {

    @Override
    public int calculate(int op1, int op2) {
        return op1 * op2;
    }
}
