package com.courses.objects;

public class PassingTest {

    public static void main(String[] args) {
        int i = 100;
        System.out.println("Before function: " + i); //100
        testPrimitive(i);
        System.out.println("After function: " + i); //100

        int[] array = new int[] {1, 2, 3};
        System.out.println(array[0] + " " + array[1] + " " + array[2]); //1, 2, 3
        testArray(array);
        System.out.println(array[0] + " " + array[1] + " " + array[2]); //1, 0, 3

        Dog dog = new Dog("Pluto", 34);
        System.out.println("Before method: " + dog);
        testDog(dog);
        System.out.println("After method: " + dog);

    }

    private static void testPrimitive(int value) {
        value = 50;
        System.out.println("In function: " + value); //50
    }

    private static void testArray(int[] array) {
        array[1] = 0;
        System.out.println(array[0] + " " + array[1] + " " + array[2]); //1, 0, 3
    }

    private static void testDog(Dog dog) {
        dog = new Dog("Bob", 12);
        System.out.println("In a method: " + dog);
    }
}
