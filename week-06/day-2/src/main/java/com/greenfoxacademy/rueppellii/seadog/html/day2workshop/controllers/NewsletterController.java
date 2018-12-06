package com.greenfoxacademy.rueppellii.seadog.html.day2workshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NewsletterController {

        @RequestMapping("/fancytable")
        public String newsletter() {
            return "fancytable";
        }
}
