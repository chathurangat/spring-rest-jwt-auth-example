package com.chathuranga.rest.jwt.auth.model;

import java.util.List;

public class User {

    private String username;
    private List<String> userRoles;

    public User() {
        super();
    }

    public User(String username, List<String> userRoles) {
        this.userRoles = userRoles;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<String> userRoles) {
        this.userRoles = userRoles;
    }
}
