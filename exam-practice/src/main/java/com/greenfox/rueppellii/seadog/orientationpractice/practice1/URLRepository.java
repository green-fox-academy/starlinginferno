package com.greenfox.rueppellii.seadog.orientationpractice.practice1;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface URLRepository extends CrudRepository<URLString, Long> {

    public Optional<URLString> findByShortenedURL(String alias);
}
