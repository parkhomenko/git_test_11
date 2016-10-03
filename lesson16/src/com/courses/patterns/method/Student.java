package com.courses.patterns.method;

public class Student {

    String name;
    int age;

    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Student newInstance(String name, int age) {
        return new Student(name, age);
    }
}
