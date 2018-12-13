package com.greenfoxacademy.rueppellii.seadog.week07day03.thymeleafproject.controllers;

import com.greenfoxacademy.rueppellii.seadog.week07day03.thymeleafproject.simbank.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {
    private List<BankAccount> accounts = new ArrayList<>();

    public BankController() {
        accounts.add(new BankAccount("Simba", 2000.00, "lion", true));
        accounts.add(new BankAccount("Nala", 5000.00, "lion", false));
        accounts.add(new BankAccount("Timon", 500.00, "meerkat", false));
        accounts.add(new BankAccount("Pumba", 1000.00, "warthog", false));
        accounts.add(new BankAccount("Scar", 0.00, "lion", true));
    }

    @RequestMapping(path = "/simbank", method = RequestMethod.GET)
    public String showAccounts(Model model) {
        model.addAttribute("accounts", accounts);
        return "simbank";
    }

    @RequestMapping(path = "/simbank/add", method = RequestMethod.GET)
    public String addAccount(Model model, @ModelAttribute(name="account") BankAccount account) {
        model.addAttribute("account", account);
        return "register";
    }

    @RequestMapping(path = "/simbank/add", method = RequestMethod.POST)
    public String addAccount(@ModelAttribute(name="account") BankAccount account) {
        accounts.add(account);
        return "redirect:/simbank";
    }
}
