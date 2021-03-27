package com.grenader.demozerotohero.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @Value("${greet.message}")
    private String message;

    @GetMapping
    public String hello()
    {
        return "Hello from "+message;
    }
}
