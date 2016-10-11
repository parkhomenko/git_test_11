package com.courses.comparable;

public class Student implements Comparable<Student> {

    private String name;
    private int age;
    private City city;

    public Student(String name, int age, City city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public int compareTo(Student o) {
        int names = this.name.compareTo(o.name);
        if (names == 0) {
            return this.city.compareTo(o.city);
        }
        return names;
    }
}
