package com.chathuranga.rest.jwt.auth.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    public List<String> getUserRoles(String username) {

        List<String> userRoles = new ArrayList<String>();

        if (username != null && username.equals("chathuranga")) {
//            return Arrays.asList("ROLE_USER", "ROLE_ADMIN");
            return Arrays.asList("ROLE_ADMIN");
        } else if (username != null && username.equals("bob")) {
            return Arrays.asList("ROLE_USER");
        }
        return userRoles;
    }
}
