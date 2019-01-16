package com.greenfox.rueppellii.tribes2.authentication.security;

import org.springframework.security.core.AuthenticationException;

public class UserAlreadyExistAuthenticationException extends AuthenticationException {

    public UserAlreadyExistAuthenticationException(String msg, Throwable t) {
        super(msg, t);
    }

    public UserAlreadyExistAuthenticationException(String msg) {
        super(msg);
    }
}
