package com.greenfox.rueppellii.seadog.week08day1.todo.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoRepository repo;

    @Autowired
    public TodoController(TodoRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/list")
    public String list(Model model, @RequestParam(required=false) String title) {
        model.addAttribute("title", repo.findAll());
        return "todo";
    }
}
