package tn.zelda.projects.salesapp.business;

import org.springframework.stereotype.Service;
import tn.zelda.projects.salesapp.model.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by zelda on 31/01/17.
 */

@Service
public class ProductBusiness implements ProductService {

    public List<Product> getProducts() {
        return Arrays.asList(
                new Product("Nexus5", 350),
                new Product("Nokia3310", 10)
        );

    }
}
