package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.model.Product;
import com.example.repository.ProductRepository;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product) {

        return repository.save(product);

    }

    @GetMapping("/product")
    public List<Product> getAllProducts() {

        return repository.findAll();

    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable Integer id) {

        return repository.findById(id).orElse(null);

    }

    @DeleteMapping("/product/{id}")
    public String deleteProduct(@PathVariable Integer id) {

        repository.deleteById(id);

        return "Product Deleted Successfully";

    }

    @PutMapping("/product")
    public Product updateProduct(@RequestBody Product product) {

        return repository.save(product);

    }

}