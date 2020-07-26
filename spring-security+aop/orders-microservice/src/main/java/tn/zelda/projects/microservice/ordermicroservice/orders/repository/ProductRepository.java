package tn.zelda.projects.microservice.ordermicroservice.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.zelda.projects.microservice.ordermicroservice.orders.model.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
