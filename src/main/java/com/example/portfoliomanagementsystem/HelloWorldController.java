package com.example.portfoliomanagementsystem;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// This annotation marks this class as a controller that handles web requests and returns the response.
@RestController
public class HelloWorldController {
    // This annotation maps HTTP requests to handler methods of this controller.
    @RequestMapping
    public String helloWorld() {
        // This method returns the string "Hello World from Spring Boot" as the response to any HTTP request.
        return "Hello World from Spring Boot. This is the new save where I will post about my journey everyday.";
    }
}

