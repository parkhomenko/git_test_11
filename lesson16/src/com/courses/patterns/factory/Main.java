package com.courses.patterns.factory;

public class Main {

    public static void main(String[] args) {

        TeaFactory factory = new TeaFactory();

        Tea greenTea = factory.createTea("green");
        Tea blackTea = factory.createTea("black");
    }
}
