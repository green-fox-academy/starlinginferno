package com.greenfoxacademy.rueppellii.seadog.intro;

public class Pet {
    String name;
    public int age;

    public Pet(String name) {
        this.name = name;
        this.age = 12;
    }

    public String getName() {
        return name;
    }
}