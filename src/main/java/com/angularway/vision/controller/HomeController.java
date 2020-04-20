package com.angularway.vision.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${app.greetings}")
    private String greetings;

    @GetMapping("/")
    public String home() {
        return this.greetings;
    }
}
