package com.greenfox.rueppellii.seadog.orientationpractice.practice1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.net.URL;

@Entity
public class URLString {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String originalURL;
    private String shortenedURL;
    private Long code;
    private Long counter;

    public URLString() {
        this.code = 1000 + (long) (Math.random() * (9999 - 1000));
        this.counter = 0L;
    }

    public URLString(String originalURL, String shortenedURL) {
        this.originalURL = originalURL;
        this.shortenedURL = shortenedURL;
        this.code = 1000 + (long) (Math.random() * (9999 - 1000));
        this.counter = 0L;
    }

    public String getOriginalURL() {
        return originalURL;
    }

    public void setOriginalURL(String originalURL) {
        this.originalURL = originalURL;
    }

    public String getShortenedURL() {
        return shortenedURL;
    }

    public void setShortenedURL(String shortenedURL) {
        this.shortenedURL = shortenedURL;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public Long getCounter() {
        return counter;
    }

    public void setCounter(Long counter) {
        this.counter = counter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
