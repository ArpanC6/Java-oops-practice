package com.example.day46springboot.controller;

import com.example.day46springboot.model.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    // GET API
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Day 46 Spring Boot";
    }

    // POST API
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return student;
    }
}
