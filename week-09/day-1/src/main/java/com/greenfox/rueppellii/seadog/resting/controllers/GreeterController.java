package com.greenfox.rueppellii.seadog.resting.controllers;

import com.greenfox.rueppellii.seadog.resting.models.ErrorMessage;
import com.greenfox.rueppellii.seadog.resting.models.Greeter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

    @GetMapping("/greeting")
    public Object greeter(@RequestParam(required = false) String name, @RequestParam(required=false) String title) {
        Greeter greeter = new Greeter();
        ErrorMessage errorMessage = new ErrorMessage();
        if (name != null && title != null) {
            greeter.setGreeter_message("Oh, hi there " + name + ", my dear " + title + "!");
            return greeter;
        }
        errorMessage.setMessage("Please provide a name!");
        return errorMessage;
    }
}
