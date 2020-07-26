package tn.zelda.projects.salesapp.presentation;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.zelda.projects.salesapp.business.CustomerService;
import tn.zelda.projects.salesapp.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zelda on 27/01/17.
 */
@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    CustomerService clientService;

    @RequestMapping("/list")
    public List<Customer> getEmployees() {
        return clientService.getCustomers();
    }

    @RequestMapping("/status")
    public String getStatus() {
        return "Customer microservice is running";
    }

}
