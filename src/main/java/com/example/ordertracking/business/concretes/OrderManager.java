package com.example.ordertracking.business.concretes;

import com.example.ordertracking.business.abstracts.OrderService;
import com.example.ordertracking.dataAccess.abstracts.OrderDao;
import com.example.ordertracking.entities.concretes.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderManager implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public void placeOrder(OrderItem orderItem) {

    }

    @Override
    public void confirmOrder(OrderItem orderItem) {

    }

    @Override
    public void approvePayment(OrderItem orderItem) {

    }

    @Override
    public void updateStockQuantity(OrderItem orderItem) {

    }

    @Override
    public void saveOrder(OrderItem orderItem) {

    }
}
