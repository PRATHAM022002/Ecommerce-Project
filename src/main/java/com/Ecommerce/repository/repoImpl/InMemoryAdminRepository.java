package com.ecommerce.repository.repoImpl;

import com.ecommerce.model.Admin;
import com.ecommerce.repository.AdminRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryAdminRepository implements AdminRepository {

    private final List<Admin> admins = new ArrayList<>();

    public List<Admin> findAll() {
        return admins;
    }


    public void save(Admin admin) {
        admins.add(admin);
    }
}
