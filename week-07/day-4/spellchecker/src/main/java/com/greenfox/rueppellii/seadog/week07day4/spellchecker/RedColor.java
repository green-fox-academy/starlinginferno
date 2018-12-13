package com.greenfox.rueppellii.seadog.week07day4.spellchecker;

import com.greenfox.rueppellii.seadog.week07day4.spellchecker.services.MyColor;
import com.greenfox.rueppellii.seadog.week07day4.spellchecker.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {

    String color;

    @Autowired
    Printer printer;

    public RedColor() {
        this.color = "red";
    }

    @Override
    public String printColor() {
        return color;
    }
}
