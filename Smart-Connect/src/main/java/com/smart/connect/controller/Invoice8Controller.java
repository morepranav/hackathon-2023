package com.smart.connect.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Invoice8Controller {

    @GetMapping(path = "/login")
    public String login()
    {
        throw new NullPointerException();
    }

    @GetMapping(path = "/successlogin")
    public String successLogin()
    {
        return "Test message";
    }
}

