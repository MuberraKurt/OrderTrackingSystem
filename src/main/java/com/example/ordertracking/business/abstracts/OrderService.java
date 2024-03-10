package com.example.ordertracking.business.abstracts;

import com.example.ordertracking.entities.concretes.OrderItem;

public interface OrderService {
    void placeOrder(OrderItem orderItem);
    void confirmOrder(OrderItem orderItem);
    void approvePayment(OrderItem orderItem);
    void updateStockQuantity(OrderItem orderItem);
    void saveOrder(OrderItem orderItem);
}
