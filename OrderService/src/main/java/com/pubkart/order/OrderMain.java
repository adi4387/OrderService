package com.pubkart.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.pubkart.order.feign")
@EnableCircuitBreaker
public class OrderMain {

	public static void main(String[] args) {
		SpringApplication.run(OrderMain.class, args);
	}

}
