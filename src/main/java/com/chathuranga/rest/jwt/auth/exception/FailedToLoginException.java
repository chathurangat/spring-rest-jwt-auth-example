package com.chathuranga.rest.jwt.auth.exception;

public class FailedToLoginException extends Exception {

    public FailedToLoginException(String username) {
        super(username);
    }
}
