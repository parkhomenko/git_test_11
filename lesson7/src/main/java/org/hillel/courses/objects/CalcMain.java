package org.hillel.courses.objects;

import java.util.Scanner;

public class CalcMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(5, 7);
        int result = calculator.addition();
        System.out.println(result + " " + calculator.getName());
    }
}
