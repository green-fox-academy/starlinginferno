package com.greenfoxacademy.rueppellii.seadog.week07day03.thymeleafproject.simbank;

public class BankAccount {
    private static int nextId = 1;

    private int id;
    private String name;
    private Double balance;
    private String animalType;
    private Boolean isKing;

    public BankAccount(String name, Double balance, String animalType, Boolean isKing) {
        this.id = nextId++;
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public Boolean getKing() {
        return isKing;
    }

    public static void setNextId(int nextId) {
        BankAccount.nextId = nextId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setKing(Boolean king) {
        isKing = king;
    }
}
