package com.techmonad.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegistryServerApplication {

	public static void main(String[] args) {
		// Tell server to look for server.properties or server.yml
		//System.setProperty("spring.config.name", "server");

		SpringApplication.run(RegistryServerApplication.class, args);
	}

}
