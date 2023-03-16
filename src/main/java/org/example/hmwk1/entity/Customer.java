package org.example.hmwk1.entity;


public class Customer extends BaseClass  {

    private String name;
    private String surName;
    private String tc;
    private int birthYear;
    private Game game;


    public Customer(int id, String email, String password) {
        super(id, email, password);
    }

    public Customer(int id, String email, String password, String name, String surName, String tc, int birthYear, Game game) {
        super(id, email, password);
        this.name = name;
        this.surName = surName;
        this.tc = tc;
        this.birthYear = birthYear;
        this.game = game;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", tc='" + tc + '\'' +
                ", birthYear=" + birthYear +
                ", game=" + game +
                '}';
    }
}
