package com.greenfoxacademy.rueppellii.seadog.webshop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shop {

    List<Item> store = new ArrayList<>();

    public Shop() {
        store.add(new Item("Running shoes", "Nike running shoes for everyday sport", 10000, 5));
        store.add(new Item("Printer", "Some HP Printer that will print pages", 50000, 2));
        store.add(new Item("Coca cola", "0.5l standard coke", 300, 0));
        store.add(new Item("Wokin", "Chicken with fried rice and WOKIN sauce", 2000, 100));
        store.add(new Item("T-shirt", "Blue with a corgi on a bike", 6000, 1));
    }

    public void addItems(Item item) {
        store.add(item);
    }

    public List<Item> onlyAvailable() {
        List<Item> available = new ArrayList<>();
        for (int i = 0; i < store.size(); i++) {
            if (store.get(i).getQuantity() > 0) {
                available.add(store.get(i));
            }
        }
        return available;
    }

    public List<Item> cheapestFirst() {
        List<Item> cheapest = new ArrayList<>();
        Collections.copy(cheapest, store);
        Collections.sort(cheapest);
        return cheapest;
    }

    public List<Item> containsKeyword(String keyword) {
        List<Item> containsK = new ArrayList<>();
        for (int i = 0; i < store.size(); i++) {
            if(store.get(i).getDescription().toLowerCase().contains(keyword)) {
                containsK.add(store.get(i));
            }
        }
        return containsK;
    }

    public int averageStock() {
        int sum = 0;
        for (int i = 0; i < store.size(); i++) {
            sum += store.get(i).getPrice();
        }
        return sum / store.size();
    }

    public Item mostExpensive() {
        return cheapestFirst().get(cheapestFirst().size() - 1);
    }

}
