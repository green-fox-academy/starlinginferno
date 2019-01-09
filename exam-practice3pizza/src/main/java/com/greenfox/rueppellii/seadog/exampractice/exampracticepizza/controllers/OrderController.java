package com.greenfox.rueppellii.seadog.exampractice.exampracticepizza.controllers;

import com.greenfox.rueppellii.seadog.exampractice.exampracticepizza.models.PizzaOrder;
import com.greenfox.rueppellii.seadog.exampractice.exampracticepizza.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/")
    public String addOrder(Model model, @ModelAttribute(value = "newOrder") PizzaOrder order) {
        model.addAttribute("newOrder", order);
        return "index";
    }

    @PostMapping("/order")
    public String saveOrder(@ModelAttribute PizzaOrder order) {
        orderService.addNewOrder(order);
        return "redirect:/";
    }

    @GetMapping("/order/{id}")
    public String showOrder(@PathVariable Long id, RedirectAttributes attributes) {
        attributes.addFlashAttribute("newOrder", orderService.showOrder(id));
        return "redirect:/";
    }

    @GetMapping("/statistics")
    public String showMostPopular(Model model) {
        model.addAttribute("mostPopular", orderService.find3MostPopular());
        return "statistics";
    }

    @GetMapping("/api/orders/{id}")
    @ResponseBody
    public PizzaOrder showOrderJSON(@PathVariable Long id) {
        return orderService.showOrder(id);
    }
}
