package com.courses.java.exceptions;

public class ErrorTest {
    public static void main(String[] args) {
        int i = 5;
        recursion(i);
    }

    private static void recursion(int number) {
        if (number == 5) {
            recursion(number);
        }
    }
}
