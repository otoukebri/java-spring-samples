package tn.zelda.projects.salesapp;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zelda on 20/02/17.
 */
@RestController
public class CustomerApiGateWayRestcontroller {

    @Autowired
    private CustomerServiceClient customerServiceClient;

    @RequestMapping("/customer-endpoint")
    @HystrixCommand(fallbackMethod = "getCustomersFallBack" )
    public String getCustomers() {
        return this.customerServiceClient.getCustomer();
    }

    public Customer getCustomersFallBack() {
        return new Customer("default","some where");
    }
}
