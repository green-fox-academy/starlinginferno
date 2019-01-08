package com.greenfox.rueppellii.seadog.practice2b.touristattractions.controllers;

import com.greenfox.rueppellii.seadog.practice2b.touristattractions.models.Attraction;
import com.greenfox.rueppellii.seadog.practice2b.touristattractions.services.AttractionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AttractionController {

    private AttractionService attractionService;

    public AttractionController(AttractionService attractionService) {
        this.attractionService = attractionService;
    }

    @GetMapping("/")
    public String mainPage(Model model, @ModelAttribute(value="attractionToEdit") Attraction attraction) {
        if(attraction != null) {
            model.addAttribute("attractionToEdit", attraction);
        }
        model.addAttribute("attractions", attractionService.listAllAttractions());
        return "index";
    }

    @PostMapping("/add")
    public String saveAttraction(@ModelAttribute("attraction") Attraction attraction) {
        attractionService.saveAttraction(attraction);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editPage(@PathVariable Long id, RedirectAttributes attributes) {
        if(attractionService.findAttraction(id) != null) {
            attributes.addFlashAttribute("attractionToEdit", attractionService.findAttraction(id));
        }
        return "redirect:/";
    }
}
