package com.openclassroom.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class LoginController {

    @GetMapping(path = "/user")
    public String getUser(){
        return "Welcome, user";
    }

    @GetMapping(path = "/admin")
    public String getAdmin(){
        return "Welcome, admin";
    }
}
