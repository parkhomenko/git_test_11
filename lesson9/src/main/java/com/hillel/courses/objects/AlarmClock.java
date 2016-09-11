package com.hillel.courses.objects;

public class AlarmClock {

    private int hours;
    private int minutes;
    private int seconds;

    private String name;

    private int alarmHours;
    private int alarmMinutes;
    private int alarmSeconds;

    public AlarmClock(int hours, int minutes, int seconds, String name) {
        if (hours < 24) {
            this.hours = hours;
        }

        if (minutes < 60) {
            this.minutes = minutes;
        }

        if (seconds < 60) {
            this.seconds = seconds;
        }

        this.name = name;
    }

    public void setAlarm(int alarmHours, int alarmMinutes, int alarmSeconds) {
        this.alarmHours = alarmHours;
        this.alarmMinutes = alarmMinutes;
        this.alarmSeconds = alarmSeconds;
    }

    public boolean alarm() {
        if (alarmHours == hours && alarmMinutes == minutes && alarmSeconds == seconds) {
            return true;
        }

        return false;
    }

}
