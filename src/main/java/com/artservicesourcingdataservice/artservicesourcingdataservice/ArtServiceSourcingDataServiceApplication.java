package com.artservicesourcingdataservice.artservicesourcingdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * ArtServiceSourcingDataServiceApplication
 *
 * This is the reference data service used by the Art Service. It is responsible for all connections to the
 * database and sourcing all data.
 */
@SpringBootApplication
@EnableEurekaClient
public class ArtServiceSourcingDataServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ArtServiceSourcingDataServiceApplication.class, args);
	}
}

