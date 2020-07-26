package tn.zelda.projects.salesapp.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by zelda on 08/02/17.
 */
@RestController
public class OrdersController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/clients")
    public void getClients(){
        //String s =restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", String.class);
        String s =restTemplate.getForObject("http://CUSTOMERS-SERVICE/api/customers/list", String.class);
        System.out.println(s);
        /*
        Quote quote = restTemplate.getForObject(
                "http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        */
    }

}
