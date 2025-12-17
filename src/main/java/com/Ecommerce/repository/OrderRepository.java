package com.project.ecommerce.repository;

import com.project.ecommerce.model.Order;

import java.util.List;

public interface OrderRepository {
    List<Order> findAll();
    void save(Order order);
}
