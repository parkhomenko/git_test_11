package com.courses.java.cycles;

public class SwitchExample {

    public static void main(String[] args) {

        int i = 1;

        switch (i) {
            case 1:
                System.out.println("You entered 1");
                break;
            case 2:
                System.out.println("You entered 2");
                break;
            case 3:
                System.out.println("You entered 3");
                break;
            default:
                System.out.println("Unknown option");
                break;
        }
    }
}
