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

    private List<Fox> foxes;

    public FoxController() {
        foxes = new ArrayList<>();
        foxes.add(new Fox("Simba"));
        foxes.add(new Fox("Nala"));
        foxes.add(new Fox("Timon"));
        foxes.add(new Fox("Pumba"));
        foxes.add(new Fox("Scar"));
    }

//    @RequestMapping(path ="/home", method = RequestMethod.GET)
//    public String showFox(Model model, @RequestParam(name = "fox") String name) {
//        for (Fox fox : foxes) {
//            if(fox.getName().equals(name)) {
//                model.addAttribute("name", fox.getName());
//                model.addAttribute("food", fox.getFood());
//                model.addAttribute("drink", fox.getDrink());
//                model.addAttribute("tricks", fox.getListOfLearnedTricks().size());
//                model.addAttribute("hungry", fox.getFoodCount());
//                model.addAttribute("learned", fox.getListOfLearnedTricks());
//            }
//        }
//        return "index";
//    }

    @RequestMapping(path ="/home", method = RequestMethod.GET)
    public String showFox(Model model, @ModelAttribute(name = "fox") Fox fox) {
        for (int i = 0; i < foxes.size(); i++) {
            if(foxes.get(i).getName().equals(fox.getName())) {
                model.addAttribute("fox", fox);
            }
        }
        return "index";
    }

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String findFoxName() {
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
    public String addFox(Model model, @ModelAttribute(name="fox") Fox fox) {
        model.addAttribute("fox", fox);
        return "signup";
    }

    @RequestMapping(path = "/signup", method = RequestMethod.POST)
    public String addFox(@ModelAttribute(name="fox") Fox fox) {
        for (int i = 0; i < foxes.size(); i++) {
            if (foxes.get(i).getName().equals(fox.getName())) {
                return "redirect:/home?fox=" + fox.getName();
            } else {
                foxes.add(fox);
            }
        }
        return "redirect:/home?fox=" + fox.getName();
    }

    @RequestMapping(path = "/nutritionstore", method = RequestMethod.GET)
    public String feedFoxGet(@RequestParam(name="fox") String s, @ModelAttribute(name = "fox") Fox fox) {

        return "restaurant";
    }

    @RequestMapping(path = "/nutritionstore", method = RequestMethod.POST)
    public String feedFox(Model model, @RequestParam(value = "fox") String s, @ModelAttribute(name = "fox") Fox fox) {
//        model.addAttribute("fox", fox);
        for (int i = 0; i < foxes.size(); i++) {
            if (fox.getName().equals(s)) {
                model.addAttribute("name", fox);
                foxes.get(i).setFood(fox.getFood());
            }
        }
        return "redirect:/home?fox=" + s;
    }

}
