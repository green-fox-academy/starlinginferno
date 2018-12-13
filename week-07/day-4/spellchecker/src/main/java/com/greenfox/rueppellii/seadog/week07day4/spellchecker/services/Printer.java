package com.greenfox.rueppellii.seadog.week07day4.spellchecker.services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {
    public String log(String message) {
        return LocalDateTime.now() + " MY PRINTER SAYS --- " + message;
    }
}