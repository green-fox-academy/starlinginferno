package com.greenfox.rueppellii.seadog.week07day4.spellchecker.controllers;

import com.greenfox.rueppellii.seadog.week07day4.spellchecker.services.MyColor;
import com.greenfox.rueppellii.seadog.week07day4.spellchecker.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private Printer printer;
    private MyColor color;

    @Autowired
    public HomeController(Printer printer, MyColor color) {
        this.printer = printer;
        this.color = color;
    }

    @ResponseBody()
    @GetMapping("/printer")
    public String printThis() {
        return printer.log("You can't stop time.");
    }

    @ResponseBody()
    @GetMapping("/color")
    public String printColor() {
        return printer.log(color.printColor());
    }



}
