package com.instances.test;

/**
 * Created by User on 06.10.2016.
 */
public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Rex", 14);
        Dog dog1 = new Dog("Rex", 15);

        DomesticDog domesticDog = new DomesticDog("Bob", 5);

        Cat cat = new Cat();

        boolean result = dog.equals(domesticDog);
        System.out.println(result);

        /*
        boolean correctEquality = dog.equals(dog1);
        System.out.println("Correct equality: " + correctEquality);
        */

        if (dog.equals(dog1)) {
            System.out.println("Dogs are equal");
        } else {
            System.out.println("Dogs are different");
        }
    }
}
