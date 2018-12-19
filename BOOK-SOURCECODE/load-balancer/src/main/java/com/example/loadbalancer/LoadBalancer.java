package com.example.loadbalancer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by OmiD.HaghighatgoO on 09/26/2018.
 */


    @SpringBootApplication
    @EnableEurekaClient
    public class LoadBalancer {


        public static void main(String[] args) {
            SpringApplication.run(LoadBalancer.class, args);
        }


        @Bean
        @LoadBalanced
        public RestTemplate getTemplate() {
            return new RestTemplate();
        }

}


