package com.javatechie.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityDemoController {

    @GetMapping("/welcome")
    private String welcome() {
        return "Welcome to java techie";
    }

    @GetMapping("/text")
    public String greeeting() {
        return "Happy to see you";
    }


    @GetMapping("/nonsecureapp")
    public String nonSecure() {
        return "This is non secure pomit anybody can acces it";
    }


}
