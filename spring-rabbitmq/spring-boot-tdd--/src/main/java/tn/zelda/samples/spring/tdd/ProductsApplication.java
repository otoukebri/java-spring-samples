package tn.zelda.samples.spring.tdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)

public class ProductsApplication {

    // start everything
    public static void main(String[] args) {
        SpringApplication.run(ProductsApplication.class, args);
    }

}