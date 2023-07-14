package com.smart.connect.controller;

import com.smart.connect.entity.LoggingException;
import com.smart.connect.exception.ResourceNotFoundException;
import com.smart.connect.repository.LoggingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class LoggingController {

    @Autowired
    private LoggingRepository loggingRepository;

    @GetMapping(path = "/logging")
    public List<LoggingException> getAllLogging() {

        return loggingRepository.findAll();
    }

    @PostMapping(path = "/logging")
    public LoggingException createLogging(@RequestBody LoggingException loggingException)  {

        return loggingRepository.save(loggingException);
    }

    @PutMapping(path = "/logging/{id}")
    public LoggingException updateLogging(@PathVariable Long id,
                                 @RequestBody LoggingException loggingDetails) {

        String s = "logging not exist with id :" + id;
        LoggingException loggingException = loggingRepository.findById(id).
                orElseThrow(() -> new ResourceNotFoundException(s));

        loggingException.setExceptionSummary(loggingDetails.getExceptionSummary());
        loggingException.setExceptionStackTrace(loggingDetails.getExceptionStackTrace());
        loggingException.setJiraId(loggingDetails.getJiraId());
        loggingException.setCommiter(loggingDetails.getCommiter());
        return loggingRepository.save(loggingException);
    }

}