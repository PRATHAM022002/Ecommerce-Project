package com.ecommerce.repository;

import com.ecommerce.model.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
    void save(User user);
}