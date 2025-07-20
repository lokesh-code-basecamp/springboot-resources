package com.learn.eCommerce.service;

import com.learn.eCommerce.repository.LearnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class LearnService {

    @Value("${aws.username}")
    private String awsUserName;

    @Autowired
    Environment env;

    @Autowired
    private LearnRepository repo;

    public String getName(){
       String awsUsrName =  env.getProperty("aws.username");
        return "I'm a service class method";
    }
}
