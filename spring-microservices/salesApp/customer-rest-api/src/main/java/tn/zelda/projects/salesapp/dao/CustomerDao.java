package tn.zelda.projects.salesapp.dao;

import org.springframework.stereotype.Service;
import tn.zelda.projects.salesapp.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zelda on 28/01/17.
 */
@Service
public class CustomerDao {

    public List<Customer> getCustomers(){
        List<Customer> clients= new ArrayList();
        clients.add(new Customer("Oussema","Tunisia"));
        clients.add(new Customer("Taha","BEN SALAH"));
        return clients;
    }
}
