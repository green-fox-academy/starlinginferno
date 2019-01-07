package com.greenfox.rueppellii.seadog.resting.controllers;

import com.greenfox.rueppellii.seadog.resting.models.ArrayToHandle;
import org.springframework.web.bind.annotation.*;

@RestController
public class ArrayController {

    @PostMapping("/arrays")
    public Object handleArray(@RequestBody ArrayToHandle arrayToHandle) {
        Integer sum = 0;
        if (arrayToHandle.getWhat().equals("sum")) {
            for (int i = 0; i < arrayToHandle.getNumbers().length; i++) {
                sum += arrayToHandle.getNumbers()[i];
            }
            arrayToHandle.setResult(sum);
        }
        return arrayToHandle;
    }
}
