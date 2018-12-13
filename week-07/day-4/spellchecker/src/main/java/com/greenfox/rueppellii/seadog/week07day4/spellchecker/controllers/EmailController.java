package com.greenfox.rueppellii.seadog.week07day4.spellchecker.controllers;

import com.greenfox.rueppellii.seadog.week07day4.spellchecker.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmailController {
    UtilityService service;

    @Autowired
    public EmailController(UtilityService service) {
        this.service = service;
    }

    @ResponseBody
    @GetMapping("/useful/email")
    public String validEmail(@RequestParam(name = "email") String email) {
        return service.validateEmail(email);
    }
}
