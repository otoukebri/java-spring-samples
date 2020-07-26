package tn.zelda.projects.salesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class HystrixApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixApiApplication.class, args);
	}
}
