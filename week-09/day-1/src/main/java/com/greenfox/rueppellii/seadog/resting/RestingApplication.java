package com.greenfox.rueppellii.seadog.resting;

import com.greenfox.rueppellii.seadog.resting.models.Log;
import com.greenfox.rueppellii.seadog.resting.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestingApplication implements CommandLineRunner {

    @Autowired
    LogRepository logRepository;

    public static void main(String[] args) {
        SpringApplication.run(RestingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Log log = new Log("/doubling", "input=15");
//        logRepository.save(log);
    }
}

