package com.project.ecommerce.repository;

import com.project.ecommerce.model.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
    void save(User user);
}