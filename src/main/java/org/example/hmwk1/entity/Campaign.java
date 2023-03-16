package org.example.hmwk1.entity;

public class Campaign {
    private int id;
    private int discountAmount=0;
    private int time=15;
    private Game game;

    public Campaign(int id,int discountAmount, int time, Game game) {
        this.discountAmount = discountAmount;
        this.time = time;
        this.game = game;
    }

    public int getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Campaign{" +
                "id=" + id +
                ", discountAmount=" + discountAmount +
                ", time=" + time +
                ", game=" + game +
                '}';
    }
}
