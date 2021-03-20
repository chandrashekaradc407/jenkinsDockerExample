package com.chandu.jenkinsDockerExample.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/getName")
    public String getMyName(){
        return "chandra Shekar ";
    }

}
