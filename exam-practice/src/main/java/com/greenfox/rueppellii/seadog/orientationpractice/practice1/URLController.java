package com.greenfox.rueppellii.seadog.orientationpractice.practice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class URLController {

    private URLService urlService;

    @Autowired
    public URLController(URLService urlService) {
        this.urlService = urlService;

    }

    @GetMapping("/")
    public String saveURL(Model model, @ModelAttribute(name="URL") URLString url) {
        model.addAttribute("URL", url);
        return "index";
    }

    @PostMapping("/save-link")
    public String saveURL(@ModelAttribute(name="URL") URLString url) {
        if (urlService.findURLbyAlias(url.getShortenedURL()) == null) {
            urlService.saveURL(url);
        }
        return "redirect:/";
    }

    @GetMapping("/a/{shortenedURL}")
    public String goToURL(@PathVariable(value="shortenedURL") String alias) {
        urlService.findURLbyAlias(alias).setCounter(urlService.findURLbyAlias(alias).getCounter() + 1);
        urlService.saveURL(urlService.findURLbyAlias(alias));
        return "redirect:" + urlService.findURLbyAlias(alias).getOriginalURL();
    }

    @GetMapping("/api/links")
    @ResponseBody
    public List<URLString> showLinks() {
        return (List<URLString>) urlService.showURLs();
    }

}
