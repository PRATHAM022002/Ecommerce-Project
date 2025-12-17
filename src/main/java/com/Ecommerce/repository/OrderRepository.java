package com.ecommerce.repository;

import com.ecommerce.model.Order;

import java.util.List;

public interface OrderRepository {
    List<Order> findAll();
    void save(Order order);
}
