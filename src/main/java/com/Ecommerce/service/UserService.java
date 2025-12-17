package com.project.ecommerce.service;

import com.project.ecommerce.exception.ResourceNotFoundException;
import com.project.ecommerce.model.User;
import com.project.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> getAll() {
        if (repo.findAll().isEmpty()) {
            throw new ResourceNotFoundException("No users found");
        }
        return repo.findAll();
    }

    public void register(User user) {
        repo.save(user);
    }
}
