package com.comparators;

import com.instances.test.Dog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DogSorter {

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Pluto", 8));
        dogs.add(new Dog("Rex", 5));
        dogs.add(new Dog("Pluto", 7));
        dogs.add(new Dog("Pluto", 14));
        dogs.add(new Dog("Pluto", 15));

        System.out.println(dogs);

        Collections.sort(dogs);

        System.out.println(dogs);

        DogNameComparator dogNameComparator = new DogNameComparator();
        Collections.sort(dogs, dogNameComparator);

        Collections.sort(dogs, (dog1, dog2) -> dog2.getAge() - dog1.getAge());

        System.out.println(dogs);
    }
}
