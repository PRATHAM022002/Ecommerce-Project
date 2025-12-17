package com.project.ecommerce.controller;

import com.project.ecommerce.model.Admin;
import com.project.ecommerce.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admins")
public class AdminController {

    @Autowired
    AdminService service;

    @GetMapping
    public List<Admin> all() {
        return service.getAll();
    }

    @PostMapping
    public String add(@RequestBody Admin a) {
        service.add(a); return "Admin added";
    }
}
