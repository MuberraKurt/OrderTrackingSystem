package com.example.ordertracking.dataAccess.abstracts;

import com.example.ordertracking.entities.concretes.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends JpaRepository<OrderItem,Integer> {
}
