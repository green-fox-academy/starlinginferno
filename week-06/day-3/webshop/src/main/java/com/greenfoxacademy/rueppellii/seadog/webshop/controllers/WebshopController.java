package com.greenfoxacademy.rueppellii.seadog.webshop.controllers;

import com.greenfoxacademy.rueppellii.seadog.webshop.Item;
import com.greenfoxacademy.rueppellii.seadog.webshop.Shop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class WebshopController {

    Shop webshopObject;

    public WebshopController() {
        webshopObject = new Shop();
        webshopObject.addItems(new Item("Running shoes", "Nike running shoes for everyday sport", 10000, 5));
        webshopObject.addItems(new Item("Printer", "Some HP Printer that will print pages", 50000, 2));
        webshopObject.addItems(new Item("Coca cola", "0.5l standard coke", 300, 0));
        webshopObject.addItems(new Item("Wokin", "Chicken with fried rice and WOKIN sauce", 2000, 100));
        webshopObject.addItems(new Item("T-shirt", "Blue with a corgi on a bike", 6000, 1));
    }

    @RequestMapping("/webshop")
    public String webshop(Model model) {
        model.addAttribute("items", webshopObject.getStore());
        return "webshop";
    }

    @RequestMapping("/webshop/available")
    public String available(Model model) {
        model.addAttribute("items", webshopObject.onlyAvailable());
        return "webshop";
    }

    @RequestMapping("/webshop/sort=price-asc")
    public String cheapest(Model model) {
        model.addAttribute("items", webshopObject.cheapestFirst());
        return "webshop";
    }

    @RequestMapping("/webshop/search")
    public String containsN(Model model, @RequestParam String name) {
        model.addAttribute("items", webshopObject.containsKeyword(name));
        return "webshop";
    }

    @RequestMapping("/webshop/average")
    public String average(Model model) {
        model.addAttribute("items", webshopObject.averageStock());
        return "average";
    }

    @RequestMapping("/webshop/most-expensive")
    public String mostE(Model model) {
        model.addAttribute("items", webshopObject.mostExpensive());
        return "webshop";
    }

    @PostMapping("/search")
    public String searchKeyword(@RequestParam("name") String name, Model model) {
        model.addAttribute("items",  webshopObject.containsKeyword(name));
        return "webshop";
    }
}
