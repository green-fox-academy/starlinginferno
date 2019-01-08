package com.greenfox.rueppellii.seadog.exampractice.practice2.controllers;

import com.greenfox.rueppellii.seadog.exampractice.practice2.models.Attraction;
import com.greenfox.rueppellii.seadog.exampractice.practice2.models.AttractionList;
import com.greenfox.rueppellii.seadog.exampractice.practice2.services.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AttractionRestController {

    private AttractionService attractionService;

    @Autowired
    public AttractionRestController(AttractionService attractionService) {
        this.attractionService = attractionService;
    }

//    @GetMapping("/budge")
//    public AttractionList listCheapest() {
//        attractionList.setAttractions(attractionService.listCheapest());
//        return attractionList;
//    }

    @GetMapping("/budge")
    public AttractionList listCheapest() {
        return attractionService.listCheapestClass();
    }
}
