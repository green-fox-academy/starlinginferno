package com.greenfoxacademy.rueppellii.seadog.webshop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shop {

    List<Item> store = new ArrayList<>();

    public Shop() {
    }

    public List<Item> getStore() {
        return store;
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
        List<Item> cheapest = new ArrayList<>(store);
        Collections.copy(cheapest, store);
        Collections.sort(cheapest);
        return cheapest;
    }

    public List<Item> containsKeyword(String keyword) {
        List<Item> containsK = new ArrayList<>();
        for (int i = 0; i < store.size(); i++) {
            if(store.get(i).getDescription().toLowerCase().contains(keyword) || store.get(i).getName().toLowerCase().contains(keyword)) {
                containsK.add(store.get(i));
            }
        }
        return containsK;
    }

    public int averageStock() {
        int sum = 0;
        for (int i = 0; i < store.size(); i++) {
            sum += store.get(i).getQuantity();
        }
        return sum / store.size();
    }

    public Item mostExpensive() {
        return cheapestFirst().get(cheapestFirst().size() - 1);
    }

}
