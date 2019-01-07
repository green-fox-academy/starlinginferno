package com.greenfox.rueppellii.seadog.resting.models;

import org.springframework.stereotype.Service;

public class Doubling {
    private Integer received;
    private Integer result;

    public Doubling(Integer received, Integer result) {
        this.received = received;
        this.result = result;
    }

    public Doubling() {
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
