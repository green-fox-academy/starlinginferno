package com.greenfox.rueppellii.tribes2.authentication.controllers;

import com.greenfox.rueppellii.tribes2.authentication.models.ApplicationUser;
import com.greenfox.rueppellii.tribes2.authentication.repositories.ApplicationUserRepository;
import com.greenfox.rueppellii.tribes2.authentication.security.UserAlreadyExistAuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private ApplicationUserRepository applicationUserRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserController(ApplicationUserRepository applicationUserRepository,
                          BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.applicationUserRepository = applicationUserRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @PostMapping("/sign-up")
    public void signUp(@RequestBody ApplicationUser user) {
        if (applicationUserRepository.findByUsername(user.getUsername()) == null) {
            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
            applicationUserRepository.save(user);
        } else throw new UserAlreadyExistAuthenticationException("Username '" + user.getUsername() + "' is already taken!");
    }
}