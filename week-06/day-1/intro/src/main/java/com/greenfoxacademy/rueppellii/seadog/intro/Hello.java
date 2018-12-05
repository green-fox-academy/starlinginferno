package com.greenfoxacademy.rueppellii.seadog.intro;

import java.util.Random;

public class Hello {
    String color;
    int size;
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag", "Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
    Random random = new Random();

    public Hello() {
    }

    public String getColor() {
        int nextInt = random.nextInt(0xffffff + 1);
        color = String.format("#%06x", nextInt);
        return color;
    }

    public int getSize() {
        size = random.nextInt(36) + 10;
        return size;
    }

    public String getHellos() {
        int helloID = random.nextInt(hellos.length);
        return hellos[helloID];
    }

}
