package com.hillel.courses.oop;

public class AnimalMain {

    public static void main(String[] args) {

        Animal animal = new Animal(8, 13);
        animal.growUp();
        animal.growUp();
        animal.eat();
        animal.eat();
        animal.eat();
        animal.walk();

        animal.info();
    }
}
