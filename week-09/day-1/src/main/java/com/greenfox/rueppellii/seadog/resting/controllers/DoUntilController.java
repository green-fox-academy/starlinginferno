package com.greenfox.rueppellii.seadog.resting.controllers;

import com.greenfox.rueppellii.seadog.resting.models.DoUntil;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoUntilController {

    @PostMapping("/dountil/{action}")
    public Object doUntil(@PathVariable(value="action") String action, @RequestParam Integer until) {
        DoUntil doUntil = new DoUntil();
        Integer sum = 0;
        Integer factor = 1;
        doUntil.setUntil(until);
        if (action.equals("sum")) {
            for (int i = 1; i < until + 1; i++) {
               sum += i;
            }
            doUntil.setResult(sum);
        } else if (action.equals("factor")) {
            for (int i = 1; i < until + 1; i++) {
                factor *= i;
            }
            doUntil.setResult(factor);
        }
        return doUntil;
    }

}
