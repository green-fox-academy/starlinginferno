package com.greenfox.rueppellii.seadog.exampractice.practice2.controllers;

import com.greenfox.rueppellii.seadog.exampractice.practice2.models.Attraction;
import com.greenfox.rueppellii.seadog.exampractice.practice2.services.AttractionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AttractionRestController {

    private AttractionService attractionService;

    public AttractionRestController(AttractionService attractionService) {
        this.attractionService = attractionService;
    }

    @GetMapping("/budge")
    public List<Attraction> listCheapest() {
        return attractionService.listCheapest();
    }
}
