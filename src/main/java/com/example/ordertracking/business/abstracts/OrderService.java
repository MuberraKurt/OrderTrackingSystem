package com.example.ordertracking.business.abstracts;

import com.example.ordertracking.entities.concretes.OrderItem;
import com.example.ordertracking.entities.concretes.Product;

public interface OrderService {
    OrderItem getOrderById(int id);
    void placeOrder(OrderItem orderItem);
    void confirmOrder(OrderItem orderItem);
    void approvePayment(OrderItem orderItem);
    void updateStockQuantity(Product product,int quantity);
    void saveOrder(OrderItem orderItem);
}
