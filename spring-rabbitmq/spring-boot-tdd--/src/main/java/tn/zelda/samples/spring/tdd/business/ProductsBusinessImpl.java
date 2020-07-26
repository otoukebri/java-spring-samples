package tn.zelda.samples.spring.tdd.business;

import org.springframework.beans.factory.annotation.Autowired;
import tn.zelda.samples.spring.tdd.entities.Product;
import tn.zelda.samples.spring.tdd.repositories.ProductsRepository;

import java.util.List;

public class ProductsBusinessImpl implements ProductsBusiness {

    @Autowired
    ProductsRepository productsRepository;

    @Override
    public List<Product> getProducts() {
        return productsRepository.getAll();
    }
}
