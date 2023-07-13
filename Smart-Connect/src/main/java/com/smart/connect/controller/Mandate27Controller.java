package com.smart.connect.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Mandate27Controller {

    Logger logger = LoggerFactory.getLogger(Mandate27Controller.class);

    @GetMapping(path = "//Mandate27/login")
    public String login()
    {
        logger.error("Error occurred while processing this request.");
        throw new NullPointerException();
    }

    @GetMapping(path = "//Mandate27/successlogin")
    public String successLogin()
    {
        logger.info("This request has been processed successfully.");
        return "Test message";
    }
}

