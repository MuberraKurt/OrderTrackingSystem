package com.example.ordertracking.api.controllers;

import com.example.ordertracking.business.abstracts.OrderService;
import com.example.ordertracking.entities.concretes.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;


    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/place")
    public ResponseEntity<String> placeOrder(@RequestBody OrderItem orderItem) {
        orderService.placeOrder(orderItem);
        return ResponseEntity.status(HttpStatus.CREATED).body("Order placed successfully.");
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveOrder(@RequestBody OrderItem orderItem) {
        orderService.saveOrder(orderItem);
        return ResponseEntity.status(HttpStatus.CREATED).body("Order saved successfully.");
    }
}
