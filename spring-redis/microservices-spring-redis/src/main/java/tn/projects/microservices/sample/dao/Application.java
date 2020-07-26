package tn.projects.microservices.sample.dao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableAutoConfiguration
//enable you to put controller in a different package than Main class
//@ComponentScan(basePackages={"tn.projects.microservices.sample.presentation","tn.projects.microservices.sample.dao"})
public class Application {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
