package com.project.ecommerce.service;

import com.project.ecommerce.exception.ResourceNotFoundException;
import com.project.ecommerce.model.Order;
import com.project.ecommerce.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repo;

    public List<Order> getAll() {
        if (repo.findAll().isEmpty()) {
            throw new ResourceNotFoundException("No orders found");
        }
        return repo.findAll();
    }

    public void place(Order order) {
        repo.save(order);
    }
}