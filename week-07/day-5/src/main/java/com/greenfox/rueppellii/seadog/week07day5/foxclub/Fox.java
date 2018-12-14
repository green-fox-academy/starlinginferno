package com.greenfox.rueppellii.seadog.week07day5.foxclub;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    private String name;
    private List<Trick> listOfLearnedTricks;
    private List<Trick> listOfTricksToLearn;
    private String food;
    private int foodCount;
    private String drink;

    public Fox(String name) {
        this.name = name;
        this.food = "takeout pizza";
        this.drink = "coffee";
        this.listOfLearnedTricks = new ArrayList<>();
        this.foodCount = 0;
    }

    public void learnTrick(Trick trick) {
        if (this.foodCount >=1) {
            listOfLearnedTricks.add(trick);
            listOfTricksToLearn.remove(trick);
        }
    }

    public void feed() {
        this.foodCount++;
    }

    public String getName() {
        return name;
    }

    public List<Trick> getListOfLearnedTricks() {
        return listOfLearnedTricks;
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

    public void setListOfLearnedTricks(List<Trick> listOfTricks) {
        this.listOfLearnedTricks = listOfTricks;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }

    public List<Trick> getListOfTricksToLearn() {
        return listOfTricksToLearn;
    }

    public void setListOfTricksToLearn(List<Trick> listOfTricksToLearn) {
        this.listOfTricksToLearn = listOfTricksToLearn;
    }
}
