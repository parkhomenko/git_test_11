package com.comparators;

import com.instances.test.Dog;

import java.util.Comparator;

public class DogNameComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog dog1, Dog dog2) {
        if (dog1.getName().equals(dog2.getName())) {
            return dog2.getAge() - dog1.getAge();
        } else {
            return dog1.getName().compareTo(dog2.getName());
        }
    }
}
