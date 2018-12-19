package com.example.greeting.controller ;

/**
 * Created by OmiD.HaghighatgoO on 09/26/2018.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class Greeting {

    @Value("${server.port}")
    private String port ;


    @RequestMapping("/greet")
    public String greet() {
        return "Welcome to Omid Haghighatgoo Project on port : " + port;
    }


    @Cacheable("user")
    public void createUser(){
        //....
    }


}
