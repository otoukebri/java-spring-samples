package tn.zelda.projects.salesapp.business;

import tn.zelda.projects.salesapp.model.Customer;

import java.util.List;

/**
 * Created by zelda on 27/01/17.
 */
public interface CustomerService {
    List<Customer> getCustomers();
    public Customer getCustomer(int id);
}
