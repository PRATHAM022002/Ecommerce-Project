package com.project.ecommerce.repository.repoImpl;

import com.project.ecommerce.model.Order;
import com.project.ecommerce.repository.OrderRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryOrderRepository implements OrderRepository {

    private final List<Order> orders = new ArrayList<>();

    public List<Order> findAll() {
        return orders;
    }

    public void save(Order order) {
        orders.add(order);
    }
}