package tn.zelda.projects.salesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class CustomerRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerRestApiApplication.class, args);
    }
}
