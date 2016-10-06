package com.instances.test;

public class InstanceOfTest {

    public static void main(String[] args) {

        Dog dog = new Dog("Rex", 15);
        System.out.println(dog instanceof Dog); // dog is a com.instances.test.Dog

        Animal animal = new Dog("Rex", 15);
        System.out.println(animal instanceof Dog); //animal is a com.instances.test.Dog

        Animal pureAnimal = new Animal();
        System.out.println(pureAnimal instanceof Animal); //pureAnimal is an com.instances.test.Animal

        System.out.println(pureAnimal instanceof Dog);

        System.out.println(pureAnimal instanceof Object);

        //getClass tests
        String className = dog.getClass().getName();
        System.out.println(className);
    }

}
