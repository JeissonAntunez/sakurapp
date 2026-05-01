package com.sakurapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrandSlam {

    @GetMapping("/test")
    public String torneo() {
        return "4 GrandSlam";
    }

}
