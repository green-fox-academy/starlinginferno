package com.greenfox.rueppellii.seadog.practice2b.touristattractions.interfaces;

import com.greenfox.rueppellii.seadog.practice2b.touristattractions.models.Attraction;
import org.springframework.data.repository.CrudRepository;

public interface AttractionRepository extends CrudRepository<Attraction, Long> {

    Attraction findTop1ByCategoryIsOrderByPrice(String category);
}
