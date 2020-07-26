package tn.zelda.projects.spring.stockservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class StockServiceApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(StockServiceApplication.class, args);
    }
}
