package com.techmonad.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAutoConfiguration
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentServiceApplication {

	public static void main(String[] args) {
		// Tell server to look for payment-service.properties or payment-service.yml
		//System.setProperty("spring.config.name", "payment-service");

		SpringApplication.run(PaymentServiceApplication.class, args);
	}

}
