package com.courses.java.cycles;

public class ArraysExampleWords {

    public static void main(String[] args) {

        int[] array = {5, 5, 1, 3, 4, 9, 12};

        /*
        for (int i = 0; i < array.length; i++) {
            if (i == 2) {
                break;
            }

            System.out.println(array[i]);
        }
        */

        for (int i = 0; i < array.length; i++) {
            if (i == 2) {
                continue;
            }

            System.out.println(array[i]);
        }
    }
}
