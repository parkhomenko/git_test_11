package com.courses.java.oop;

public class TicTacToe extends Game {

    private Player playerFirst;
    private Player playerSecond;

    private Board board;

    public TicTacToe(Player playerFirst, Player playerSecond, Board board) {
        this.playerFirst = playerFirst;
        this.playerSecond = playerSecond;
        this.board = board;
    }

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
