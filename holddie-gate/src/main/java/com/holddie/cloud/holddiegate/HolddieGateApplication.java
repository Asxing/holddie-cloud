package com.holddie.cloud.holddiegate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HolddieGateApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolddieGateApplication.class, args);
	}
}
