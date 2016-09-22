package com.hillel.polymorphism.oop;

public class CalculatorOOPMain {

    public static void main(String[] args) {

        Operation add = new AdditionOperation();
        Operation subtract = new SubtractionOperation();
        Operation multiply = new MultiplicationOperation();

        int result = add.calculate(3, 8);
        int result1 = subtract.calculate(5, 2);
        int result2 = multiply.calculate(3, 4);
    }
}
