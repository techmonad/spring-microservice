package com.techmonad.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAutoConfiguration
@EnableDiscoveryClient
@SpringBootApplication
public class NotificationServiceApplication {

	public static void main(String[] args) {
		// Tell server to look for notification-service.properties or notification-service.yml
		//System.setProperty("spring.config.name", "notification-service");

		SpringApplication.run(NotificationServiceApplication.class, args);
	}

}
