package com.greenfox.rueppellii.seadog.resting.controllers;

import com.greenfox.rueppellii.seadog.resting.models.Doubling;
import com.greenfox.rueppellii.seadog.resting.models.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {

//    private Doubling doubling;
//    private ErrorMessage errorMessage;

//    @Autowired
//    public DoublingController(Doubling doubling, ErrorMessage errorMessage) {
//        this.doubling = doubling;
//        this.errorMessage = errorMessage;
//    }

    @GetMapping("/doubling")
    public Object doubling(@RequestParam("input") Integer inputNumber) {
        Doubling doubling = new Doubling();
        ErrorMessage errorMessage = new ErrorMessage();
        if (inputNumber != null) {
            doubling.setReceived(inputNumber);
            doubling.setResult(inputNumber * 2);
            return doubling;
        }
        errorMessage.setMessage("Please provide an input!");
        return errorMessage;
    }
}
