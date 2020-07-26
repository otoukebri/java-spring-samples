package tn.zelda.samples.spring.tdd.repositories;

import tn.zelda.samples.spring.tdd.entities.Product;

import java.util.List;

public interface ProductsRepository {
    List<Product> getAll();
}
