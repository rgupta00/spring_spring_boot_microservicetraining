package com.productappclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableFeignClients("com.productappclient.proxyservice")
@SpringBootApplication
@EnableEurekaClient
public class ProductappClientApplication {

//	@Bean
//	public RestTemplate restTemplate(){
//		return new RestTemplate();
//	}
	public static void main(String[] args) {

		SpringApplication.run(ProductappClientApplication.class, args);
	}

}
