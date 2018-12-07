package com.greenfoxacademy.rueppellii.seadog.webshop.controllers;

import com.greenfoxacademy.rueppellii.seadog.webshop.Item;
import com.greenfoxacademy.rueppellii.seadog.webshop.Shop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebshopController {

    Shop webshopObject;

    public WebshopController() {
        webshopObject = new Shop();
        webshopObject.addItems(new Item("Daily cream soup", "Check our facebook for today's offer!", 500, 5));
        webshopObject.addItems(new Item("Sandwiches", "caprese, tuna, feta", 700, 2));
        webshopObject.addItems(new Item("Macaron", "passion fruit, strawberry, lemon curd, pumpkin spice", 300, 0));
        webshopObject.addItems(new Item("Coffee", "caramel latte", 1000, 100));
        webshopObject.addItems(new Item("Lemonade", "hibiscus, lemon, cinnamon apple", 400, 1));
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
