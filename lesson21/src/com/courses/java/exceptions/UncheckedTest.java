package com.courses.java.exceptions;

public class UncheckedTest {
    public static void main(String[] args) {
        try {
            int result = getElement(0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(0);
        }

        int[] array = new int[] {1, 2, 3, 4, 5};
        int element = array[5];

        System.out.println(element);
    }

    private static int getElement(int k) {
        int s = 5 / k;
        return s;
    }
}
