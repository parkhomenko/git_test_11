package com.hillel.courses.objects;

public class Flashlight {

    String color;
    int mode;
    int batteries;

    public Flashlight(String color, int mode, int batteries) {
        this.color = color;
        this.mode = mode;
        this.batteries = batteries;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public int getBatteries() {
        return batteries;
    }

    public void setBatteries(int batteries) {
        this.batteries = batteries;
    }
}
