package org.hillel.courses.objects;

public class Lamp {

    private int power;
    private String color;
    private boolean shines;

    public Lamp() {
        this(30, "red", true);
    }

    public Lamp(int power, String color, boolean shines) {
        if (power == 50) {
            System.out.println("power can't be 50");
            this.power = 0;
            this.shines = false;
        } else {
            this.power = power;
            this.color = color;
            this.shines = shines;
        }
    }

    public void switchOn() {
        shines = true;
    }

    public void switchOff() {
        shines = false;
    }

    public boolean isShines() {
        return shines;
    }
}
