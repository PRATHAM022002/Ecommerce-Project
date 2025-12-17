package com.project.ecommerce.repository;

import com.project.ecommerce.model.CartItem;

import java.util.List;

public interface CartRepository {
    List<CartItem> findAll();
    void save(CartItem item);
}