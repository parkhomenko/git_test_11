package com.courses.java.cycles;

public class NumbersExample {

    public static void main(String[] args) {

        int i = 2345612;

        while (i > 0) {
            int rem = i % 10;
            System.out.println(rem);
            i /= 10; //i = i / 10;
        }
    }
}
