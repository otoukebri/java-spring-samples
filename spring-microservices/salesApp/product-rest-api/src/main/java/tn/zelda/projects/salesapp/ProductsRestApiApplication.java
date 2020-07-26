package tn.zelda.projects.salesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableCircuitBreaker
@SpringBootApplication
@EnableEurekaClient
public class ProductsRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsRestApiApplication.class, args);
	}
}
