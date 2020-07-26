package tn.zelda.projects.salesapp.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.zelda.projects.salesapp.dao.CustomerDao;
import tn.zelda.projects.salesapp.model.Customer;

import java.util.List;

/**
 * Created by zelda on 27/01/17.
 */

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDao customerDao;

    @Override
    public List<Customer> getCustomers() {
        return  customerDao.getCustomers();
    }

    @Override
    public Customer getCustomer(int id) {
        return new Customer("ToTo", "Tunisia");
    }
}
