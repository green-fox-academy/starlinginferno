package com.greenfox.rueppellii.seadog.resting.controllers;

import com.greenfox.rueppellii.seadog.resting.models.SithTranslator;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SithController{

    @PostMapping("/sith")
    public Object translate(@RequestBody SithTranslator translator) {
        translator.setSith_text(translator.sithTranslator(translator.getText()));
        return translator;
    }
}