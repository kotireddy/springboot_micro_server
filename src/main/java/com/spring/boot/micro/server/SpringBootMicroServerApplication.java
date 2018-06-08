package com.spring.boot.micro.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootMicroServerApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootMicroServerApplication.class, args);
	}
}
