package org.hillel.courses.lesson10;

public class RecursionExample {

    public static void main(String[] args) {
        func(5);

        int result = factorial(5);
    }

    public static void func(int param) {
        System.out.println("In function " + param);

        /*
        if (param == 10) {
            return;
        }
        */

        param++;
        func(param);
    }

    public static int factorial(int value) {
        if (value == 0) {
            return 1;
        } else {
            int result = factorial(value - 1);
            return value * result;
        }
    }

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
