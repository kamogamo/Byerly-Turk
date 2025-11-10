//ここはエンティティクラスでDBから来るデータをプログラムで扱いやすくする
package com.example.keibaapi.repository.entity;

public class GIWinner {
    private static Integer year;
    private static String race;
    private static String winner;

    public static Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public  String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public  String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
}
