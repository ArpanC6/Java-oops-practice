package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Day 44 Spring Boot is running!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot";
    }
}
