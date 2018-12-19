package com.example.loadbalancer.controller;

/**
 * Created by OmiD.HaghighatgoO on 09/26/2018.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

    @RestController
    @RequestMapping("/balancer")
    public class LoadBalancerController {

        @Autowired
        private RestTemplate restTemplate ;


        @RequestMapping("/loadGreet")
        public String greet() {
          return restTemplate.getForObject("http://GREETING-APPLICATION/greeting/greet" ,String.class) ;
        }


}

