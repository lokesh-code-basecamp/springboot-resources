package com.learn.eCommerce.util;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MyHelper {

    public void helper(){
        System.out.println("I'm helper method");
    }

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
