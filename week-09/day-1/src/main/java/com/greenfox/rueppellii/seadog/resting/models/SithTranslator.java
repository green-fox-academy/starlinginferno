package com.greenfox.rueppellii.seadog.resting.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SithTranslator {

    private String text;
    private String sith_text;

    public SithTranslator() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSith_text() {
        return sith_text;
    }

    public void setSith_text(String sith_text) {
        this.sith_text = sith_text;
    }

    public String sithTranslator(String inputText) {
        String[] splitText = inputText.split("\\s");
        List<String> splitList = new ArrayList<String>(Arrays.asList(splitText));
        List<String> arrangedList = new ArrayList<>();
        for (int i = 1; i < splitList.size(); i += 2) {
                arrangedList.add(splitList.get(i));
            for (int j = 0; j < splitList.size(); j+=2) {
                arrangedList.add(splitList.get(j));
                }
            }
        return "Yoda: " + arrangedList;
    }
}
