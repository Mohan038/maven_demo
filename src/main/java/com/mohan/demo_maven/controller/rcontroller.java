package com.mohan.demo_maven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mohan.demo_maven.domain.login;
import com.mohan.demo_maven.service.regservice;

@Controller
public class rcontroller {
 
    @Autowired
    private regservice rservice;
 
    @GetMapping("/reg")
    public String register()
    {
 
        return "reg";
    }
    @GetMapping("/login")
    public String tlogin(){
        return "login";
    }
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    @PostMapping("/reg")
    public String insertLogin(@ModelAttribute("user") login user) {
        String username=user.getUsername();
        String password=user.getPassword();
        rservice.insertLogin(username,password);
        return "login"; 
    }
}
