package com.smart.connect.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping(path = "/login")
    public String login()
    {
        throw new NullPointerException();
        //return "Test message";
    }

    @GetMapping(path = "/successlogin")
    public String successLogin()
    {
        return "Test message";
    }

    @PostMapping(path = "/healthEndpoint")
    public String healthSuccess()
    {
        return "This works";
    }

}
