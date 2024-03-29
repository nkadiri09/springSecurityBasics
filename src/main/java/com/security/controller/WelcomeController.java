package com.security.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Value("${name.kadiri}")
    private String name;

    @GetMapping("/welcome")
    public String sayWelcome(){
        return "Welcome to Spring Security name is: "+name;
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false,defaultValue = "TechGeekNext User") String name) {
        return "Hello "+name;
    }
}
