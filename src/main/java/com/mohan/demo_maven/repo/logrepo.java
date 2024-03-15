package com.mohan.demo_maven.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mohan.demo_maven.domain.login;

@Repository
public interface logrepo extends JpaRepository<login,String>
{
login  findByUsernameAndPassword(String username,String password);

}
