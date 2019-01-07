package com.greenfox.rueppellii.seadog.resting.controllers;

import com.greenfox.rueppellii.seadog.resting.models.Log;
import com.greenfox.rueppellii.seadog.resting.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    private LogService logService;

    @Autowired
    public LogController(LogService logService) {
        this.logService = logService;
    }

    @GetMapping("/log")
    public Iterable<Log> showLogs() {
        return logService.showAll();
    }
}
