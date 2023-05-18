package com.productapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProductappServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductappServiceApplication.class, args);
	}

}
