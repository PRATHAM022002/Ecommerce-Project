package com.ecommerce.repository.repoImpl;

import com.ecommerce.model.CartItem;
import com.ecommerce.repository.CartRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryCartRepository implements CartRepository {

    private final List<CartItem> cart = new ArrayList<>();

    public List<CartItem> findAll() {
        return cart;
    }

    public void save(CartItem item) {
        cart.add(item);
    }
}