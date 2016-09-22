package com.courses.java.oop;

import java.util.Random;

public class AI extends Player {

    public AI(String name, int age, char type) {
        super(name, age, type);
    }

    @Override
    public String enterMove() {
        Random rnd = new Random();
        int i = rnd.nextInt(3);
        int j = rnd.nextInt(3);
        String move = String.valueOf(i) + String.valueOf(j);
        return move;
    }
}
