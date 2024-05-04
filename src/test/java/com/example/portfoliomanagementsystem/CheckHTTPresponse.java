package com.example.portfoliomanagementsystem;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import static org.junit.jupiter.api.Assertions.assertEquals;

// This annotation indicates that this class is a test class and will be managed by the Spring Boot test environment.
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CheckHTTPresponse {
    // This annotation injects the actual port that was randomly assigned for testing.
    @LocalServerPort
    private int port;

    // This annotation autowires an instance of TestRestTemplate, which is a convenient way to test RESTful services in Spring Boot applications.
    @Autowired
    private TestRestTemplate testRestTemplate;

    // This method tests if the HTTP response from the server matches the expected string.
    @Test
    public void shouldPassIfStringMatches(){
        // This assertion checks if the response from the server matches the expected string.
        assertEquals("Hello World.This is the new save here I will post about my journey everyday..",
                // This method sends a GET request to the specified URL (constructed using the injected port) and retrieves the response as a String.
                testRestTemplate.getForObject("http://localhost:" + port + "/",
                        String.class));
    }
}

