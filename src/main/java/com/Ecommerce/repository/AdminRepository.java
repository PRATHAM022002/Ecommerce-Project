package com.project.ecommerce.repository;

import com.project.ecommerce.model.Admin;

import java.util.List;

public interface AdminRepository {
    List<Admin> findAll();
    void save(Admin admin);
}
