package com.hillel.courses.oop.polymorphism;

public class PolymorphicMain {

    public static void main(String[] args) {

        Animal animalDog = new Dog();
        animalDog.voice();

        Animal animalCat = new Cat();
        animalCat.voice();

        Animal[] zoo = new Animal[] {new Dog(), new Cat(), new Cat()};
        for (Animal animal : zoo) {
            animal.voice();
        }

        /*
        Dog dog = (Dog) animalDog;
        dog.someMethod();

        Cat cat = (Cat) animalDog;
        cat.newCatMethod();
        */

    }
}
