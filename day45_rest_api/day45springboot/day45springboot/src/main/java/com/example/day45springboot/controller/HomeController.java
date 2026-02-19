package com.example.day45springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Day 45 Spring Boot application running";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy";
    }
}
