package com.courses.comparable;

public class City implements Comparable<City> {
    private String name;
    private int longitude;
    private int latitude;

    public City(String name, int longitude, int latitude) {
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public int compareTo(City o) {
        return this.name.compareTo(o.name);
    }
}
