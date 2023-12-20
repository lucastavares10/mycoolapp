package com.springboot.demo.mycoolapp.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {

    @Value("${coach.name}")
    private String coachName;

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World !! " + this.coachName;
    }


}
