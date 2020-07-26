package tn.zelda.projects.microservice.ordermicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(basePackageClasses = {
        OrderMicroserviceApplication.class,
        Jsr310JpaConverters.class
})
@SpringBootApplication
public class OrderMicroserviceApplication {


    public static void main(String[] args) {
        SpringApplication.run(OrderMicroserviceApplication.class, args);
    }

}
