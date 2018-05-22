package com.holddie.cloud.holddiecenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HolddieCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolddieCenterApplication.class, args);
	}
}
