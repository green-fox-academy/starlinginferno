package com.greenfoxacademy.rueppellii.seadog.intro;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

    long id;
    String content;
    static AtomicLong al = new AtomicLong(1);
    String name;

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getName() {
        return name;
    }

    public Greeting(String name) {
        this.id = al.getAndIncrement();
        this.name = name;
    }
}
