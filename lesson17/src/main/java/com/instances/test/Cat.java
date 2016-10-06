package com.instances.test;

/**
 * Created by User on 06.10.2016.
 */
public class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return name.equals(cat.name);

    }
}
