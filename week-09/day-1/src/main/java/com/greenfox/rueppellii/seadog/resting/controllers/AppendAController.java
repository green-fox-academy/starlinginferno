package com.greenfox.rueppellii.seadog.resting.controllers;

import com.greenfox.rueppellii.seadog.resting.models.Appended;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendAController {

    @GetMapping("/appenda/{appendable}")
    public Object appendA(@PathVariable(value="appendable") String appendable) {
        if (appendable != null) {
            Appended appended = new Appended();
            appended.setAppended(appendable + "a");
            return appended;
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
}
