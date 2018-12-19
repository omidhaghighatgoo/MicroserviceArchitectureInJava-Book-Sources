package com.example.greeting;

/**
 * Created by OmiD.HaghighatgoO on 09/26/2018.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient



	@EnableCaching
	@SpringBootApplication
	public class GreetingApplication {

		public static void main(String[] args) {
			SpringApplication.run(GreetingApplication.class, args);
		}
	}



