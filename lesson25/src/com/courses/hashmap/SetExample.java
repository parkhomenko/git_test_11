package com.courses.hashmap;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> dogs = new HashSet<>();
        dogs.add("Jim");
        dogs.add("Bim");
        dogs.add("Jim");

        System.out.println(dogs);
    }
}
