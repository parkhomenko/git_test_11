package com.hillel.courses.oop;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AnimalTest {

    Animal animal;

    @Before
    public void setUp() {
        animal = new Animal(23, 54);
    }

    @Test
    public void walkTest() {
        int weight = animal.getWeight();
        animal.walk();
        assertThat(animal.getWeight(), is(weight - 1));
    }

    @Test
    public void eatTest() {
        int weight = animal.getWeight();
        animal.eat();
        assertThat(animal.getWeight(), is(weight + 1));
    }
}
