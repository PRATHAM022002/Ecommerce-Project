package com.project.ecommerce.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    private Long adminId;
    private String name;
    private String role;
    private String permissions;
}