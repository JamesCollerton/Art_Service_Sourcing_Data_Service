package com.artservicesourcingdataservice.artservicesourcingdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/*
TODO: Comments
TODO: Swagger
TODO: Testing
TODO: Docker
 */
@SpringBootApplication
@EnableEurekaClient
public class ArtServiceSourcingDataServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ArtServiceSourcingDataServiceApplication.class, args);
	}
}

