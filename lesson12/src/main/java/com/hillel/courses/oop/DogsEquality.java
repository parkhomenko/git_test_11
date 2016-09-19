package com.hillel.courses.oop;

public class DogsEquality {

    public static void main(String[] args) {
        Dog dog = new Dog("Pluto", "Bloodhound");
        Dog dog1 = new Dog("Pluto", "Bloodhound");
        Dog dog2 = new Dog("Rex", "Bloodhound");

        System.out.println(dog.equals(dog1));
        System.out.println(dog.equals(dog2));
    }
}
