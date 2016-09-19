package com.hillel.courses.oop;

public class Dog extends Animal {

    private String name;
    private String breed;

    public Dog(String name, String breed) {
        super(7, 12);
        this.name = name;
        this.breed = breed;
    }

    public Dog(String name, String breed, int height, int weight) {
        super(height, weight);
        this.name = name;
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Bark...");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Dog dog = (Dog) o;
        return (this.name.equals(dog.name)) &&
                (this.breed.equals(dog.breed));
    }
}
