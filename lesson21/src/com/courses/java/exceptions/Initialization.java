package com.courses.java.exceptions;

public class Initialization {

    {
        int k = 0;
        int i = 5 / k;
    }

    int a = 7;

    public Initialization() {
        int r = 0;
    }

    public static void main(String[] args) {
        Initialization initialization = new Initialization();
    }
}
