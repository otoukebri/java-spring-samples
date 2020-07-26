package tn.zelda.projects.salesapp;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import tn.zelda.projects.salesapp.model.Customer;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zelda on 16/02/17.
 */
@Service
public class CustomerService {

    private final RestTemplate restTemplate;

    public CustomerService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }


    @RequestMapping("/cb-customers")
    @HystrixCommand(fallbackMethod ="getEmployeesFallBack" )
    public List<Customer> getEmployees(){
        URI uri = URI.create("http://localhost:8090/customers");
        //List<Customer>  l =  this.restTemplate.getForEntity(uri,Customer.class);
        return new ArrayList<Customer>();
    }

    public List<Customer> getEmployeesFallBack(){
        return new ArrayList<Customer>();
    }



}
