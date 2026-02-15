package com.example.springbootweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "Hello, welcome to spring boot web application.";
    }

    @RequestMapping("/about")
    public String about() {
        return "About you.";
    }
}
