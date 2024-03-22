package com.mohan.demo_maven.controller;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mohan.demo_maven.domain.login;

import com.mohan.demo_maven.service.logservice;
import com.mohan.demo_maven.service.regservice;

@Controller
public class controller {
 
    @Autowired
    private logservice service;
    private regservice rservice;
 
    @GetMapping("/")
    public String api()
    {
 
        return "login";
    }
 
    @PostMapping("/login")
    public String login(@ModelAttribute("user") login user) {
 
        login oauthUser = service.log(user.getUsername(), user.getPassword());
 
        System.out.print(oauthUser);
        if (Objects.nonNull(oauthUser)) {
            return "redirect:/display";
        } else {
            return "redirect:/";
        }
    }
 
    @GetMapping("/display")
    public String display() {
        return "display";
    }
    
    
    
}
