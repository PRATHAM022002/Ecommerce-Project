package com.ecommerce.controller;

import com.project.ecommerce.model.CartItem;
import com.project.ecommerce.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    CartService service;

    @GetMapping
    public List<CartItem> all() {
        return service.getAll();
    }

    @PostMapping
    public String add(@RequestBody CartItem item) {
        service.add(item); return "Added to cart";
    }
}