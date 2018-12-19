package com.example.hello.controller ;

/**
 * Created by OmiD.HaghighatgoO on 09/26/2018.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/hello")
@EnableDiscoveryClient
public class HelloWorld {


    @Autowired
    DiscoveryClient discoveryClient ;

    @Value("${spring.application.name}")
    private String appName ;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam("pass") String pass) {
        List<ServiceInstance> serviceInstances = discoveryClient.getInstances( appName) ;
        serviceInstances.get(0).getServiceId();
        return "Hello World";
    }
}


