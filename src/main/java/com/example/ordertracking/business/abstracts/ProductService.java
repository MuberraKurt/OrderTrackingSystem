package com.example.ordertracking.business.abstracts;

import com.example.ordertracking.core.utilities.DataResult;
import com.example.ordertracking.core.utilities.Result;
import com.example.ordertracking.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();

    DataResult<Product> getById(int id);

    Result add(Product product);
    DataResult<Product> save(Product product);
    Result deleteById(int id);
    DataResult<List<Product>> findByCategory(String category);
    DataResult<List<Product>> filterByPrice(double minPrice, double maxPrice);
}
