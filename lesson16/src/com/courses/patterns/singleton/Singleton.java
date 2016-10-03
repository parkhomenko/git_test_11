package com.courses.patterns.singleton;

public class Singleton {

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    private Singleton() {
    }

    public void doSomething() {
        System.out.println("do something");
    }
}
