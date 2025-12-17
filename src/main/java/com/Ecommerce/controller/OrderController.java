package com.project.ecommerce.controller;

import com.project.ecommerce.model.Order;
import com.project.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService service;

    @GetMapping
    public List<Order> all() {
        return service.getAll();
    }

    @PostMapping
    public String place(@RequestBody Order o) {
        service.place(o); return "Order placed";
    }
}