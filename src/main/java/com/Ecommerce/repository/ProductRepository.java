package com.ecommerce.repository;

import com.ecommerce.model.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
    Product findById(Long id);
    void save(Product product);
}