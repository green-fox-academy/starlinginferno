package com.greenfoxacademy.rueppellii.seadog.intro.Controllers;

import com.greenfoxacademy.rueppellii.seadog.intro.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    @RequestMapping(value="/greeting")
    public Greeting greeting(@RequestParam String name) {
        Greeting greet = new Greeting("Hello, " + name);
        return greet;
    }
}
