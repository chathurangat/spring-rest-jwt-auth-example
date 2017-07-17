package com.chathuranga.rest.jwt.controller;

import org.springframework.http.HttpMethod;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api")
public class WelcomeController {

    @Secured("ROLE_ADMIN")
    @RequestMapping(path = "/admin/hello", method = RequestMethod.GET)
    public String helloAdminController() {
        String loggedUserName = SecurityContextHolder.getContext().getAuthentication().getName();

        return "Hello Admin " + loggedUserName;
    }


    @Secured("ROLE_USER")
    @RequestMapping(path = "/user/hello", method = RequestMethod.GET)
    public String helloUserController() {

        String loggedUserName = SecurityContextHolder.getContext().getAuthentication().getName();

        return "Hello User " + loggedUserName;
    }
}
