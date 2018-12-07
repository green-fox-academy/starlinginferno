package com.greenfoxacademy.rueppellii.seadog.webshop;

public class Item implements Comparable<Item> {
    private String name;
    private String description;
    private int price;
    private int quantity;

    public Item() {
    }

    public Item(String name, String description, int price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Item otherItem) {
        int comparePrice = otherItem.getPrice();
        return this.getPrice()-comparePrice;
    }
}
