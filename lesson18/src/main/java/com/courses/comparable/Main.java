package com.courses.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        City seattle = new City("Seattle", 234, 123);
        City odessa = new City("Odessa", 234, 123);

        Student bob = new Student("Bob", 35, seattle);
        Student sam = new Student("Sam", 35, seattle);
        Student dean = new Student("Dean", 35, seattle);
        Student dean2 = new Student("Dean", 35, odessa);

        List<Student> list = new ArrayList<>();
        list.add(bob);
        list.add(sam);
        list.add(dean);
        list.add(dean2);

        Collections.sort(list);
    }
}
