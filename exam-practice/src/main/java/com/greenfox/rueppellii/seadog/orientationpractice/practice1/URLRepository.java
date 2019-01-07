package com.greenfox.rueppellii.seadog.orientationpractice.practice1;

import org.springframework.data.repository.CrudRepository;

public interface URLRepository extends CrudRepository<URLString, Long> {

    public URLString findByShortenedURL(String alias);
}
