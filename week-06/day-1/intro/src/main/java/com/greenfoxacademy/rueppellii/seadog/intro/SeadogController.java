package com.greenfoxacademy.rueppellii.seadog.intro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeadogController {

    @RequestMapping("/seadog")
    public String hello(@RequestParam String p) {
        System.out.println(p);
        return "hello Seadogs!";
    }

    @RequestMapping("/pet")
    public Pet pet() {
        return new Pet("P");
    }
}