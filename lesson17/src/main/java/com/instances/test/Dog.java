package com.instances.test;

public class Dog extends Animal implements Comparable<Dog> {

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o.getClass() != Dog.class) return false;

        Dog dog = (Dog) o;

        if (this.name == null) return false;

        boolean nameResult = this.name.equals(dog.name);
        boolean ageResult = this.age == dog.age;
        return nameResult && ageResult;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age + " years old";
    }

    @Override
    public int compareTo(Dog o) {
        /*
        if (this.age < o.age) {
            return -1;
        } else if (this.age > o.age) {
            return 1;
        } else {
            return 0;
        }
        */
        return this.age - o.age;
    }
}
