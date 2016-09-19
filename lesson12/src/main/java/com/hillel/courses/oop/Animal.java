package com.hillel.courses.oop;

public class Animal {

    private int height;
    private int weight;

    /*
    public Animal() {
        this.height = 1;
        this.weight = 5;
    }
    */

    public Animal(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void walk() {
        this.weight--;
    }

    public void eat() {
        this.weight++;
    }

    public void growUp() {
        this.height++;
    }

    public void info() {
        System.out.println("Animal info:");
        System.out.println("Height: " + this.height);
        System.out.println("Weight: " + this.weight);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
