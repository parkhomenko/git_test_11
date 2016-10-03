package com.courses.patterns.factory;

public class GreenTea extends Tea {

    public GreenTea(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void cupOfTea() {
        System.out.println("A cup of green tea");
    }
}
