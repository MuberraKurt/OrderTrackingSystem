package com.example.ordertracking.business.abstracts;

import com.example.ordertracking.entities.concretes.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAll();
    Customer getById(Integer id);
    Customer save(Customer customer);
    void deleteById(Integer id);
}
