package com.courses.java.cycles;

public class CycleExample {

    public static void main(String[] args) {

        /*
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        */

        /*int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++; // i = i + 1;
        }*/

        int i = 1;
        while (i <= 5) {
            System.out.println(++i);
        }

        i = 1;
        while (i <= 5) {
            ++i;
            System.out.println(i);
        }

        i = 100;
        do {
            System.out.println("Example");
        } while (i < 10);

    }
}
