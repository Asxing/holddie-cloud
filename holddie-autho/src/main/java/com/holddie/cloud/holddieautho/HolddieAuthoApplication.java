package com.holddie.cloud.holddieautho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HolddieAuthoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolddieAuthoApplication.class, args);
	}
}
