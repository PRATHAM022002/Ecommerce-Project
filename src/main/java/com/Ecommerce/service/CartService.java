package com.project.ecommerce.service;

import com.project.ecommerce.exception.ResourceNotFoundException;
import com.project.ecommerce.model.CartItem;
import com.project.ecommerce.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository repo;

    public List<CartItem> getAll() {
        if (repo.findAll().isEmpty()) {
            throw new ResourceNotFoundException("Cart is empty");
        }
        return repo.findAll();
    }

    public void add(CartItem item) {
        repo.save(item);
    }
}
