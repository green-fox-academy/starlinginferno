package com.greenfox.rueppellii.seadog.orientationpractice.practice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URL;
import java.util.List;

@Service
public class URLService {

    private URLRepository urlRepository;

    @Autowired
    public URLService(URLRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    public void saveURL(URLString url) {
        urlRepository.save(url);
    }

    public URLString findURLbyAlias(String alias) {
        if (urlRepository.findByShortenedURL(alias).isPresent()) {
            return urlRepository.findByShortenedURL(alias).get();
        }
        return null;
    }

    public Iterable<URLString> showURLs() {
        return urlRepository.findAll();
    }
}
