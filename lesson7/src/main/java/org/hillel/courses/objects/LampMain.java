package org.hillel.courses.objects;

public class LampMain {

    public static void main(String[] args) {

        /*
        Lamp lamp1 = new Lamp(65, "white", false);
        lamp1.power = 80;

        Lamp lamp2 = new Lamp(100, "green", false);

        lamp2 = lamp1;

        lamp2.power = 130;
        */

        //System.gc();

        //Lamp lamp = new Lamp(50, "red", true);
        Lamp lamp = new Lamp();
        //lamp.power = 30;

        lamp.switchOff();

        boolean shines = lamp.isShines();

        if (shines) {
            System.out.println("Lamp is shining");
        } else {
            System.out.println("Lamp is not shining");
        }
    }
}
