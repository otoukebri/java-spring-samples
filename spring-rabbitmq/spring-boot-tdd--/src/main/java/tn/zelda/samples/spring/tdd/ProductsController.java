package tn.zelda.samples.spring.tdd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.zelda.samples.spring.tdd.business.ProductsBusiness;
import tn.zelda.samples.spring.tdd.entities.Product;

import java.util.List;

@RestController
public class ProductsController {

//    @Autowired
//    ProductsBusiness productsBusiness;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
        System.out.println("ProductsController.getProducts");
        // return new ResponseEntity<>(productsBusiness.getProducts(), HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
