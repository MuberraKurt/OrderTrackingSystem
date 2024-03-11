package com.example.ordertracking.business.concretes;

import com.example.ordertracking.business.abstracts.OrderService;
import com.example.ordertracking.dataAccess.abstracts.OrderDao;
import com.example.ordertracking.dataAccess.abstracts.ProductDao;
import com.example.ordertracking.entities.concretes.OrderItem;
import com.example.ordertracking.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderManager implements OrderService {
    @Autowired
    private OrderDao orderDao;
    private ProductDao productDao;

    @Autowired
    public OrderManager(OrderDao orderDao,ProductDao productDao) {
        this.orderDao = orderDao;
        this.productDao=productDao;
    }

    @Override
    public OrderItem getOrderById(int id) {
        return orderDao.findById(id).orElse(null);
    }
    @Override
    public void placeOrder(OrderItem orderItem) {
        if (isValidOrderItem(orderItem)) {
            Product product = orderItem.getProduct();
            if (product != null && product.getStockQuantity() >= orderItem.getQuantity()) {
                confirmOrder(orderItem);
                approvePayment(orderItem);
                updateStockQuantity(product, orderItem.getQuantity());
                orderDao.save(orderItem);
                System.out.println("Order placed successfully.");
            } else {
                System.out.println("Product is out of stock or invalid.");
            }
        } else {
            System.out.println("Invalid order item.");
        }
    }

    public boolean isValidOrderItem(OrderItem orderItem) {
        return orderItem != null && orderItem.getProduct() != null;
    }

    public void confirmOrder(OrderItem orderItem) {
        orderItem.setOrderStatus("Confirmed");
    }

    public void approvePayment(OrderItem orderItem) {
        orderItem.setPaymentStatus("Approved");
    }

    public void updateStockQuantity(Product product, int quantity) {
        product.setStockQuantity(product.getStockQuantity() - quantity);
        productDao.save(product);
    }

    @Override
    public void saveOrder(OrderItem orderItem) {
        orderDao.save(orderItem);
    }
}
