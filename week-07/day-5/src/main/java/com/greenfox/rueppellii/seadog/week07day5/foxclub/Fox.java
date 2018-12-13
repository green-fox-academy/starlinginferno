package com.greenfox.rueppellii.seadog.week07day5.foxclub;

import java.util.List;

public class Fox {
    private String name;
    private List<Trick> listOfTricks;
    private String food;
    private String drink;

    public Fox(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Trick> getListOfTricks() {
        return listOfTricks;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setListOfTricks(List<Trick> listOfTricks) {
        this.listOfTricks = listOfTricks;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
