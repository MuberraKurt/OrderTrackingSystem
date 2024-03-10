package com.example.ordertracking.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_item")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="o_id")
    private Integer id;

    @Column(name="order_status")
    private String orderStatus;

    @Column(name="order_date")
    private Date orderDate;

    @Column(name="customer_name")
    private String customerName;
}