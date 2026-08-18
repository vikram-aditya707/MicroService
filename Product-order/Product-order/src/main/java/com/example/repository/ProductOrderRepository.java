package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.ProductOrder;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, Integer> {

}