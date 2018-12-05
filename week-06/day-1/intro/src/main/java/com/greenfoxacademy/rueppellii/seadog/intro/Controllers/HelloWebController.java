package com.greenfoxacademy.rueppellii.seadog.intro.Controllers;

import com.greenfoxacademy.rueppellii.seadog.intro.Greeting;
import com.greenfoxacademy.rueppellii.seadog.intro.Hello;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {

    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam String name) {
        Greeting greet = new Greeting(name);
        Hello hel = new Hello();
        model.addAttribute("name", greet.getName());
        model.addAttribute("atomic", greet.getId());
        model.addAttribute("fontColor", hel.getColor());
        model.addAttribute("fontSize", hel.getSize());
        model.addAttribute("hello", hel.getHellos());
        return "greeting";
    }
}
