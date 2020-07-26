package tn.zelda.projects.salesapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import tn.zelda.projects.salesapp.business.ProductBusiness;
import tn.zelda.projects.salesapp.business.ProductService;
import tn.zelda.projects.salesapp.model.Product;

import java.util.List;

/**
 * Created by zelda on 31/01/17.
 */

@Controller
public class ProductController {

    @Autowired
    ProductService productService;
    @RequestMapping("/employee")
    public List<Product> getProducts(){
        return productService.getProducts();
    }
}
