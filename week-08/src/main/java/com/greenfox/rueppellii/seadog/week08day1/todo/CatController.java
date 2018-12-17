package com.greenfox.rueppellii.seadog.week08day1.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CatController {

    private CatRepository repo;

    @Autowired
    public CatController(CatRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/create")
    public String create(@RequestParam(required=false) String name) {
        if (name != null) {
            repo.save(new Cat(name));
        } else {
            repo.save(new Cat());
        }
        return "index";
    }

    @GetMapping("/listcats")
    @ResponseBody
    public Iterable<Cat> list() {
        return repo.findAll();
    }
}
