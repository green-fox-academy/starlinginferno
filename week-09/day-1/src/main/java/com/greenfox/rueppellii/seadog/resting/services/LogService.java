package com.greenfox.rueppellii.seadog.resting.services;

import com.greenfox.rueppellii.seadog.resting.models.Log;
import com.greenfox.rueppellii.seadog.resting.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    private LogRepository logRepository;

    @Autowired
    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public Iterable<Log> showAll() {
        return logRepository.findAll();
    }
}
