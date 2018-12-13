package com.greenfox.rueppellii.seadog.week07day4.spellchecker;

import com.greenfox.rueppellii.seadog.week07day4.spellchecker.services.MyColor;
import com.greenfox.rueppellii.seadog.week07day4.spellchecker.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpellcheckerApplication implements CommandLineRunner {
    Printer printer;
    MyColor red;

    @Autowired
    public SpellcheckerApplication(Printer printer, MyColor red) {
        this.printer=printer;
        this.red=red;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpellcheckerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(printer.log("hello"));
    }
}

