package tn.zelda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.zelda.domain.Product;
import tn.zelda.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    tn.zelda.repository.CustomProductRepository CustomProductRepository;

    @GetMapping
    public Iterable<Product> getAll() {
        System.out.println("ProductController.getAll");
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getById(@PathVariable Long  id) {
        return productRepository.findById(id);
    }

    @PostMapping
    public void create(@RequestBody Product product) {
        productRepository.save(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productRepository.deleteById(id);
    }

    @PostMapping("/search")
    public List<Product> search(@RequestBody Product product) {

        return CustomProductRepository.search(product);
    }

    @GetMapping("/search/code2/{code}")
    public Product getByCode(@PathVariable String code) {
        return this.productRepository.getByCode(code);
    }

    @GetMapping("/search/code/{code}")
    public Product getByCode2(@PathVariable String code) {
        return this.productRepository.getByCode2(code);
    }


}
