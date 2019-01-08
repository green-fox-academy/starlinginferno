package com.greenfox.rueppellii.seadog.exampractice.practice2.services;

import com.greenfox.rueppellii.seadog.exampractice.practice2.models.Attraction;
import com.greenfox.rueppellii.seadog.exampractice.practice2.models.AttractionList;
import com.greenfox.rueppellii.seadog.exampractice.practice2.repositories.AttractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AttractionService {

    private AttractionRepository attractionRepository;

    @Autowired
    public AttractionService(AttractionRepository attractionRepository) {
        this.attractionRepository = attractionRepository;
    }

    public Iterable<Attraction> listAllAttractions() {
        return attractionRepository.findAll();
    }

    public void saveAttraction(Attraction attraction) {
        attractionRepository.save(attraction);
    }

    public Attraction findAttraction(Long id) {
        return attractionRepository.findById(id).get();
    }

    public Attraction findCheapest(String category) {
        return attractionRepository.findTop1ByCategoryIsOrderByPrice(category);
    }

    public List<Attraction> listCheapest() {
        List<Attraction> cheapest = new ArrayList<>();
        cheapest.add(findCheapest("restaurant"));
        cheapest.add(findCheapest("park"));
        cheapest.add(findCheapest("museum"));
        return cheapest;
    }

    public AttractionList listCheapestClass() {
        AttractionList attractions = new AttractionList();
        attractions.setAttractions(listCheapest());
        return attractions;
    }
}
