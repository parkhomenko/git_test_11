package com.hillel.polymorphism.random;

import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {
        Random random = new Random();
        int res = random.nextInt(3); //0..2 [0;3)
        System.out.println(res);
    }
}
