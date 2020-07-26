package tn.zelda.projects.salesapp;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCircuitBreaker
@EnableEurekaClient
@EnableZuulProxy
public class ZuulServerApplication {

    //@Bean
    //@LoadBalanced
    /*RestTemplate loadBalancedRestTemplate() {
        return new RestTemplate();
    }
    */

    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication.class, args);
    }

    @Bean
    SimpleFilter simpleFilter() {
        return new SimpleFilter();
    }

    @Component
    class DiscoveryClientExample implements CommandLineRunner {

        @Autowired
        private DiscoveryClient discoveryClient;

        @Override
        public void run(String... strings) throws Exception {
            discoveryClient.getInstances("customers-service").forEach((ServiceInstance s) -> {
                System.out.println("###"+ToStringBuilder.reflectionToString(s)+s.getMetadata());
            });

        }
    }
}
