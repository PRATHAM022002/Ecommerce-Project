package com.project.ecommerce.service;

import com.project.ecommerce.exception.ResourceNotFoundException;
import com.project.ecommerce.model.Admin;
import com.project.ecommerce.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository repo;

    public List<Admin> getAll() {
        if (repo.findAll().isEmpty()) {
            throw new ResourceNotFoundException("No admins found");
        }
        return repo.findAll();
    }

    public void add(Admin admin) {
        repo.save(admin);
    }
}