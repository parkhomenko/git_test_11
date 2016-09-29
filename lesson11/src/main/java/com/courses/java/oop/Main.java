package com.courses.java.oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Game game = new TicTacToe();
        game.startGame();


    }

    private static String getMoveFromConsole(Scanner scanner) {
        System.out.println("Player moves...");
        System.out.print("Enter move: ");
        return scanner.next();
    }
}
