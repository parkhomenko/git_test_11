package com.courses.java.cycles;

public class ArraysExample {

    public static void main(String[] args) {

        int a = 8;
        //int[] array = {8, 3, 9, 4, 5, 6};
        int[] array = new int[6];
        array[0] = 5;
        array[1] = 6;
        array[5] = 3;

        /*int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }*/

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
