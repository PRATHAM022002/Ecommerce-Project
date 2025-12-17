package com.ecommerce.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long orderId;
    private Long userId;
    private double totalPrice;
    private String shippingAddress;
    private String orderStatus;
    private String paymentStatus;
}
