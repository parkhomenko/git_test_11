package com.hillel.polymorphism.oop;

public class AdditionOperation implements Operation {

    @Override
    public int calculate(int op1, int op2) {
        return op1 + op2;
    }
}
