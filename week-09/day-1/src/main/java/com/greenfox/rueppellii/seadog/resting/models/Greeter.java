package com.greenfox.rueppellii.seadog.resting.models;

public class Greeter {

    private String greeter_message;

    public Greeter(String greeter_message) {
        this.greeter_message = greeter_message;
    }

    public Greeter() {
    }

    public String getGreeter_message() {
        return greeter_message;
    }

    public void setGreeter_message(String greeter_message) {
        this.greeter_message = greeter_message;
    }
}
