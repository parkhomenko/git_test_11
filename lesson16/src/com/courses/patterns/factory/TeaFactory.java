package com.courses.patterns.factory;

public class TeaFactory {

    public Tea createTea(String tea) {
        switch (tea) {
            case "green":
                return new GreenTea("green", "some type");
            case "black":
                return new BlackTea("black", "some type");
            default:
                return null;
        }
    }
}
