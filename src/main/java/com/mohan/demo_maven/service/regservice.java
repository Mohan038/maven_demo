package com.mohan.demo_maven.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohan.demo_maven.domain.login;

import com.mohan.demo_maven.repo.logrepo;


@Service
public class regservice {
    @Autowired
    private logrepo rrep;
    public void insertLogin( String username,  String password){
        login user =new login();
        user.setUsername(username);
        user.setPassword(password);
        rrep.save(user);


    }
}
