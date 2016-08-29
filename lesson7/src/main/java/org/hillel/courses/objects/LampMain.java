package org.hillel.courses.objects;

public class LampMain {

    public static void main(String[] args) {

        Lamp lamp1 = new Lamp(65, "white", false);
        lamp1.power = 80;

        Lamp lamp2 = new Lamp(100, "green", false);

        lamp2 = lamp1;

        lamp2.power = 130;

        //System.gc();
    }
}
