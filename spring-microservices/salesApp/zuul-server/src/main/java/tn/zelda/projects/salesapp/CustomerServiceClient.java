package tn.zelda.projects.salesapp;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by zelda on 27/01/17.
 */

@Service
public class CustomerServiceClient {

    @Autowired
    private RestTemplate loadBalancedRestTemplate;

    RestTemplate loadBalancedRestTemplate() {
        return new RestTemplate();
    }

    public String getCustomer(){
       return loadBalancedRestTemplate.getForObject("http://CUSTOMERS-SERVICE/api/customers/test", String.class);
    }

}
