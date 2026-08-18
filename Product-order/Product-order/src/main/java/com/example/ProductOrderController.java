package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.model.ProductOrder;
import com.example.repository.ProductOrderRepository;

@RestController
public class ProductOrderController {

    @Autowired
    private ProductOrderRepository repository;

    @PostMapping("/order")
    public ProductOrder addOrder(@RequestBody ProductOrder order) {

        return repository.save(order);

    }

    @GetMapping("/order")
    public List<ProductOrder> getOrders() {

        return repository.findAll();

    }

    @GetMapping("/order/{id}")
    public ProductOrder searchOrder(@PathVariable Integer id) {

        return repository.findById(id).orElse(null);

    }

    @DeleteMapping("/order/{id}")
    public String deleteOrder(@PathVariable Integer id) {

        repository.deleteById(id);

        return "Order Deleted Successfully";

    }

    @PutMapping("/order")
    public ProductOrder updateOrder(@RequestBody ProductOrder order) {

        return repository.save(order);

    }

}