package com.courses.patterns.factory;

public class BlackTea extends Tea {

    public BlackTea(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void cupOfTea() {
        System.out.println("A cup of black tea");
    }
}
