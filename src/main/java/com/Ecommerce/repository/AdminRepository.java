package com.ecommerce.repository;

import com.ecommerce.model.Admin;

import java.util.List;

public interface AdminRepository {
    List<Admin> findAll();
    void save(Admin admin);
}
