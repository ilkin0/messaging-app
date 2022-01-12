package com.ilkinmehdiyev.messagingapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public record TestOAuth2() {

    @GetMapping
    public String welcome(){
        return "Welcome OAuth 2.0";
    }

    @GetMapping("/user")
    public Principal user(Principal principal){
        System.out.println("username" + principal.getName());
        return principal;
    }
}
