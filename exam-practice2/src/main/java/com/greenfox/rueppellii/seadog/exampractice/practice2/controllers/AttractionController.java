package com.greenfox.rueppellii.seadog.exampractice.practice2.controllers;

import com.greenfox.rueppellii.seadog.exampractice.practice2.models.Attraction;
import com.greenfox.rueppellii.seadog.exampractice.practice2.services.AttractionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AttractionController {

    private AttractionService attractionService;

    public AttractionController(AttractionService attractionService) {
        this.attractionService = attractionService;
    }

    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("attractions", attractionService.listAllAttractions());
        return "index";
    }

    @GetMapping("/add")
    public String addAttraction(@ModelAttribute("newAttraction") Attraction attraction) {
        return "add";
    }

    @PostMapping("/add")
    public String saveAttraction(@ModelAttribute("newAttraction") Attraction attraction) {
        attractionService.saveAttraction(attraction);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editPage(@PathVariable Long id, Model model) {
        model.addAttribute("attractionToEdit", attractionService.findAttraction(id));
        return "edit";
    }

    @PostMapping("/edit/{id}")
    public String editAttraction(@PathVariable Long id, @ModelAttribute("attractionToEdit") Attraction attraction) {
        attractionService.saveAttraction(attraction);
        return "redirect:/";
    }
}
