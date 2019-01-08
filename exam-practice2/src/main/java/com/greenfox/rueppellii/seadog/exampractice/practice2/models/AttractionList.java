package com.greenfox.rueppellii.seadog.exampractice.practice2.models;

import org.springframework.stereotype.Service;

import java.util.List;

public class AttractionList {

    private List<Attraction> attractions;

    public AttractionList() {
    }

    public List<Attraction> getAttractions() {
        return attractions;
    }

    public void setAttractions(List<Attraction> attractions) {
        this.attractions = attractions;
    }
}
