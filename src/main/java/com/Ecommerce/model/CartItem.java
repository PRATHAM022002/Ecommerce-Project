package com.project.ecommerce.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
    private Long cartItemId;
    private Long productId;
    private int quantity;
    private double totalPrice;
}