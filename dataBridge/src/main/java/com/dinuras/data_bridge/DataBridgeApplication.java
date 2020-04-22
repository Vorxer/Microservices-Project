package com.dinuras.data_bridge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DataBridgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataBridgeApplication.class, args);
	}

}
