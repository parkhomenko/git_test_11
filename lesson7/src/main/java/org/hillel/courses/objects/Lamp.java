package org.hillel.courses.objects;

public class Lamp {

    int power;
    String color;
    boolean shines;

    Lamp(int powerMethod, String colorMethod, boolean shinesMethod) {
        power = powerMethod;
        color = colorMethod;
        shines = shinesMethod;
    }

    void switchOn() {
        shines = true;
    }

    void switchOff() {
        shines = false;
    }

    boolean isShines() {
        return shines;
    }
}
