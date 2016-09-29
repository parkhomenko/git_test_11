package com.courses.java.oop;

public class TicTacToe extends Game {

    Player playerFirst = new Human("Bob", 25, 'X');
    Player playerSecond = new AI("Mike", 35, 'O');

    Board board = new Board(playerFirst, playerSecond);

    @Override
    boolean gameFinished() {
        return board.gameFinished();
    }

    @Override
    void makeMove() {
        board.makeMove();
    }

    @Override
    void printBoard() {
        board.printBoard();
    }

    @Override
    Player getWinner() {
        return board.getWinner();
    }
}
