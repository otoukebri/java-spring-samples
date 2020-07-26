package tn.zelda.projects.microservice.ordermicroservice.orders.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import tn.zelda.projects.microservice.ordermicroservice.orders.model.Product;
import tn.zelda.projects.microservice.ordermicroservice.orders.repository.ProductRepository;

import java.util.List;

@RestController("/api/v1/orders")
public class OrdersController {

    private ProductRepository productRepository;

    @Autowired
    public OrdersController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Secured("ROLE_USER")
    @RequestMapping
    public List<Product> getAllOrder() {
        System.out.println("OrdersController.getAllOrder");
        return productRepository.findAll();
    }

}
