package com.greenfox.rueppellii.seadog.week08day4.reddit.controller;

import com.greenfox.rueppellii.seadog.week08day4.reddit.models.User;
import com.greenfox.rueppellii.seadog.week08day4.reddit.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private PostService postService;

    @GetMapping("/")
    public String login(Model model, @ModelAttribute("user") User user) {
        model.addAttribute("user", user);
        return "login";
    }

    @PostMapping("/login")
    public String loggedIn(@ModelAttribute("user") User user) {
        postService.saveUser(user);
        return "redirect:/reddit/";
    }
}
