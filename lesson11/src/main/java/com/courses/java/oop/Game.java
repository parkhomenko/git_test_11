package com.courses.java.oop;

public abstract class Game {

    abstract boolean gameFinished();
    abstract void makeMove();
    abstract void printBoard();
    abstract Player getWinner();

    final void startGame() {
        while (!gameFinished()) {

            makeMove();
            printBoard();
        }

        Player player = getWinner();
        System.out.println(player.getName() + " " + player.getAge());
    }
}
