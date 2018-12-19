package com.example.gateway;

/**
 * Created by OmiD.HaghighatgoO on 09/26/2018.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

	@Configuration
	@SpringBootApplication
	public class GatewayApplication {

	@Bean
		public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
			return builder.routes()
					.route(p -> p
							.path("/greeting/**")
							.filters(f -> f.addRequestHeader("Application", "Greeting"))
							.uri("http://localhost:2222"))
					.route(p -> p
							.path("/hello/**")
							.filters(f -> f.addRequestHeader("Application", "HelloWorld"))
							.uri("http://localhost:3333"))
					.build();
		}

		public static void main(String[] args) {
			SpringApplication.run(GatewayApplication.class, args);
		}

	}


