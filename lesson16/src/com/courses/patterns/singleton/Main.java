package com.courses.patterns.singleton;

public class Main {

    public static void main(String[] args) {
        //Singleton singleton = new Singleton();

        Singleton singleton = Singleton.getInstance();
        Singleton sing1 = Singleton.getInstance();
        Singleton sing2 = Singleton.getInstance();

        singleton.doSomething();
    }
}
