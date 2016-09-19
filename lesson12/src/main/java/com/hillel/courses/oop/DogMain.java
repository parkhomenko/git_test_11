package com.hillel.courses.oop;

public class DogMain {

    public static void main(String[] args) {
        Dog dog = new Dog("Pluto", "Bloodhound");
        dog.eat();
        dog.walk();
        dog.growUp();
        dog.growUp();
        dog.growUp();

        //dog.info();

        //dog.bark();

        //Dog dog2 = new Dog("Pluto", "Bloodhound", 5, 10);

        System.out.println(dog);
    }
}
