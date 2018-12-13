package com.greenfox.rueppellii.seadog.week07day5.foxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FoxController {

    @RequestMapping(path = "/home", method = RequestMethod.GET)
    public String showAccounts(Model model) {
//        model.addAttribute("accounts", accounts);
        return "index";
    }
}
