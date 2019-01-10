package com.greenfox.rueppellii.seadog.orientationpractice.practice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class URLController {

    private URLService urlService;

    @Autowired
    public URLController(URLService urlService) {
        this.urlService = urlService;
    }

    @GetMapping("/")
    public String saveURL(Model model, @ModelAttribute("URL") URLString url, @ModelAttribute("success") String success, @ModelAttribute("error") String error) {
        model.addAttribute("URL", url);
        model.addAttribute("success", success);
        model.addAttribute("error", error);
        return "index";
    }

    @PostMapping("/save-link")
    public String saveURL(RedirectAttributes attribute, @ModelAttribute("URL") URLString url) {
        if (urlService.findURLbyAlias(url.getShortenedURL()) == null) {
            urlService.saveURL(url);
            attribute.addFlashAttribute("success", "Your URL is aliased to {" + url.getShortenedURL() + "} and your secret code is {" + url.getCode() + "}.");
        } else {
            attribute.addFlashAttribute("error", "Your alias is already in use!");
            attribute.addFlashAttribute("URL", url);
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

    @DeleteMapping("/api/links/{id}")
    public ResponseEntity deleteIfMatches(@PathVariable Long id, @RequestBody SecretCodeInput secretCode) {
        if(urlService.findURLById(id) != null && !urlService.findURLById(id).getCode().equals(secretCode.getSecretCode())) {
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        } else if (urlService.findURLById(id) != null && urlService.findURLById(id).getCode().equals(secretCode.getSecretCode())) {
            urlService.deleteURL(id);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else if(urlService.findURLById(id) == null) {
            return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
