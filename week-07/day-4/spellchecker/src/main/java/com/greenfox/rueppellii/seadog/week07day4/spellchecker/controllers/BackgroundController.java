package com.greenfox.rueppellii.seadog.week07day4.spellchecker.controllers;

import com.greenfox.rueppellii.seadog.week07day4.spellchecker.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BackgroundController {
    UtilityService service;

    @Autowired
    public BackgroundController(UtilityService service) {
        this.service=service;
    }

    @GetMapping("/useful/colored")
    public String changeBG(Model model) {
        model.addAttribute("color", service.randomColor());
        return "index";
    }

}
