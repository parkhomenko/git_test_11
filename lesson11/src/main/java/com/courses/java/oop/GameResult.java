package com.courses.java.oop;

import java.util.Calendar;
import java.util.Date;

public class GameResult {

    private Player player;
    private Date date;
    private String result;

    public GameResult(Player player, Date date, String result) {
        this.player = player;
        this.date = date;
        this.result = result;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Date getDate() {
        return new Date(date.getTime());
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
