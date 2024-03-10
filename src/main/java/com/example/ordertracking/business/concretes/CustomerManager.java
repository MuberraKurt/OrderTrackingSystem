package com.example.ordertracking.business.concretes;

import com.example.ordertracking.business.abstracts.CustomerService;
import com.example.ordertracking.dataAccess.abstracts.CustomerDao;
import com.example.ordertracking.entities.concretes.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerManager implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public List<Customer> getAll() {
        return customerDao.findAll();
    }

    @Override
    public Customer getById(Integer id) {
        return customerDao.findById(id).orElse(null);
    }

    @Override
    public Customer save(Customer customer) {
        return customerDao.save(customer);
    }

    @Override
    public void deleteById(Integer id) {
        customerDao.deleteById(id);
    }
}
