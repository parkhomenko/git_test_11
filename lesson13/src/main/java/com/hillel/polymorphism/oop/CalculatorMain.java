package com.hillel.polymorphism.oop;

public class CalculatorMain {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int resAdd = calculator.calculate(3, 5, "+");
        int resSub = calculator.calculate(5, 2, "-");
        int resMul = calculator.calculate(5, 2, "*");

        System.out.println("Addition: " + resAdd);
        System.out.println("Subtraction: " + resSub);
        System.out.println("Multiplication: " + resMul);
    }
}
