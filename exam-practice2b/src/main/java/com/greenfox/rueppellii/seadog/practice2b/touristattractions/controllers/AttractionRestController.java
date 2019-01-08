package com.greenfox.rueppellii.seadog.practice2b.touristattractions.controllers;

import com.greenfox.rueppellii.seadog.practice2b.touristattractions.models.AttractionList;
import com.greenfox.rueppellii.seadog.practice2b.touristattractions.services.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttractionRestController {

    private AttractionService attractionService;

    @Autowired
    public AttractionRestController(AttractionService attractionService) {
        this.attractionService = attractionService;
    }

    @GetMapping("/budge")
    public AttractionList listCheapest() {
        return attractionService.listCheapestClass();
    }
}