package com.project.ecommerce.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long userId;
    private String name;
    private String email;
    private String password;
    private String shippingAddress;
    private String paymentDetails;
}
