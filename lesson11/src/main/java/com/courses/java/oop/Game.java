package com.courses.java.oop;

import java.util.Date;

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

        GameResult result = new GameResult(player, new Date(), "draw");

        Date date = result.getDate();
        date.setYear(2016);

        Statistics statistics = new Statistics();
        statistics.addResult(result);
    }
}
