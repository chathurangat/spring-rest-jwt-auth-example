package com.chathuranga.rest.jwt.controller;

import com.chathuranga.rest.jwt.auth.exception.FailedToLoginException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class AppControllerAdviser {

    @ResponseBody
    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler(FailedToLoginException.class)
    public Map<String, String> handleUserLoginFailure(Exception ex) {

        Map<String, String> errorMap = new HashMap<String, String>();
        errorMap.put("error", ex.getMessage());
        return errorMap;
    }


    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public Map<String, String> handleBadRequest(Exception ex) {

        Map<String, String> errorMap = new HashMap<String, String>();
        errorMap.put("error"," Please check whether request contains all request params.");
        return errorMap;
    }
}
