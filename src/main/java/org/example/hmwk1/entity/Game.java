package org.example.hmwk1.entity;

public class Game{
    private int id;
    private String name;
    private double cost=0;
    private String description = "Lorem ipsum dolores ...";
    private boolean hasOwner = false;

    public Game(int id, String name, double cost, String description, boolean hasOwner) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.hasOwner = hasOwner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isHasOwner() {
        return hasOwner;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", description='" + description + '\'' +
                ", hasOwner=" + hasOwner +
                '}';
    }
}
