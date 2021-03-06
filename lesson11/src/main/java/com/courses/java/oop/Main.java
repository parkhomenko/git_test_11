package com.courses.java.oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Player playerFirst = new Human("Bob", 25, 'X');
        Player playerSecond = new AI("Mike", 35, 'O');

        Board board = new Board(playerFirst, playerSecond);

        Game game = new TicTacToe(playerFirst, playerSecond, board);
        game.startGame();


    }

    private static String getMoveFromConsole(Scanner scanner) {
        System.out.println("Player moves...");
        System.out.print("Enter move: ");
        return scanner.next();
    }
}
