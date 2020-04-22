package com.dinuras.group_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class FleetServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FleetServiceApplication.class, args);
	}

}
