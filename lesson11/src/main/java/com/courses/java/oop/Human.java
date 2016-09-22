package com.courses.java.oop;

import java.util.Scanner;

public class Human extends Player {

    public Human(String name, int age, char type) {
        super(name, age, type);
    }

    @Override
    public String enterMove() {
        Scanner scanner = new Scanner(System.in);
        return getMoveFromConsole(scanner);
    }

    private String getMoveFromConsole(Scanner scanner) {
        System.out.println("Player moves...");
        System.out.print("Enter move: ");
        return scanner.next();
    }


}
