package com.mohan.demo_maven.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohan.demo_maven.domain.login;
import com.mohan.demo_maven.repo.logrepo;

@Service
public class logservice {
@Autowired
private logrepo rep;

public login log(String username,String password)
{
    login user=rep.findByUsernameAndPassword(username, password);
    return user;
    
}

}
