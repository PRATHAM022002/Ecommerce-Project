package com.ecommerce.repository;

import com.ecommerce.model.CartItem;

import java.util.List;

public interface CartRepository {
    List<CartItem> findAll();
    void save(CartItem item);
}