package com.greenfox.rueppellii.seadog.week07day5.foxclub.controllers;

import com.greenfox.rueppellii.seadog.week07day5.foxclub.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FoxController {

    private List<Fox> foxes = new ArrayList<>();

    public FoxController() {
        foxes.add(new Fox("Simba"));
        foxes.add(new Fox("Nala"));
        foxes.add(new Fox("Timon"));
        foxes.add(new Fox("Pumba"));
        foxes.add(new Fox("Scar"));
    }

    @RequestMapping(path ="/home", method = RequestMethod.GET)
    public String showAccounts(Model model, @RequestParam(name = "fox") String name) {
        for (Fox fox : foxes) {
            if(fox.getName().equals(name)) {
                model.addAttribute("name", fox.getName());
                model.addAttribute("food", fox.getFood());
                model.addAttribute("drink", fox.getDrink());
                model.addAttribute("tricks", fox.getListOfLearnedTricks().size());
                model.addAttribute("hungry", fox.getFoodCount());
            }
        }
        return "index";
    }

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String findFoxName(Model model) {
        return "login";
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String findFoxName(@RequestParam(name="fox") String s) {
        for (Fox fox : foxes) {
            if (fox.getName().equals(s)) {
                return "redirect:/home?fox=" + s;
            }
        }
        return "foxnotfound";
    }

    @RequestMapping(path = "/signup", method = RequestMethod.GET)
    public String addFox(Model model, @ModelAttribute(name="fox") String s) {
        model.addAttribute("foxName", s);
        return "signup";
    }

    @RequestMapping(path = "/signup", method = RequestMethod.POST)
    public String addFox(@ModelAttribute(name="fox") String s) {
        for (Fox fox : foxes) {
            if (fox.getName().equals(s)) {
                return "redirect:/home?fox=" + s;
            } else {
                foxes.add(new Fox(s));
            }
        }
        return "redirect:/home?fox=" + s;
    }
}
