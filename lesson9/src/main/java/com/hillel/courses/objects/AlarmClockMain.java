package com.hillel.courses.objects;

public class AlarmClockMain {

    public static void main(String[] args) {

        AlarmClock clock1 = new AlarmClock(7, 45, 5, "Casio");

        clock1.setAlarm(7, 45, 0);

        if (clock1.alarm()) {
            System.out.println("Alarm");
        }

        /*
        clock1.hours = 12;
        clock1.minutes = 4;
        clock1.seconds = 75;
        clock1.name = "Casio";
        */

        /*
        AlarmClock clock2 = new AlarmClock();
        clock2.hours = 10;
        clock2.minutes = 34;
        clock2.seconds = 55;
        clock2.name = "Noname";
        */
    }
}
