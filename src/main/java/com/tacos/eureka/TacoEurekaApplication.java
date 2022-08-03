package com.tacos.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TacoEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacoEurekaApplication.class, args);
	}

}
