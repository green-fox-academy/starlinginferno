package com.greenfox.rueppellii.seadog.exampractice.practice2.repositories;

import com.greenfox.rueppellii.seadog.exampractice.practice2.models.Attraction;
import org.springframework.data.repository.CrudRepository;

public interface AttractionRepository extends CrudRepository<Attraction, Long> {

    Attraction findTop1ByCategoryIsOrderByPrice(String category);
}
