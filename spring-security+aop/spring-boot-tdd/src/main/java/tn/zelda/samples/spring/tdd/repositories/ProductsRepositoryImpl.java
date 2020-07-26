package tn.zelda.samples.spring.tdd.repositories;

import org.springframework.stereotype.Repository;
import tn.zelda.samples.spring.tdd.entities.Product;

import java.util.List;

@Repository
public class ProductsRepositoryImpl implements ProductsRepository {

    @Override
    public List<Product> getAll() {
        return null;
    }
}
