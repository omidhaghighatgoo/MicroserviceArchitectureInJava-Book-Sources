package com.example.demo;

/**
 * Created by OmiD.HaghighatgoO on 09/26/2018.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

        @EnableEurekaServer
        @SpringBootApplication
        public class EurekaServiceApplication {

            public static void main(String[] args) {
                SpringApplication.run(EurekaServiceApplication.class, args);
            }
        }


