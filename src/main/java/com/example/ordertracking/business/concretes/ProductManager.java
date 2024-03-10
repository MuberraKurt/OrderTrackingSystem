package com.example.ordertracking.business.concretes;

import com.example.ordertracking.business.abstracts.ProductService;
import com.example.ordertracking.core.utilities.*;
import com.example.ordertracking.dataAccess.abstracts.ProductDao;
import com.example.ordertracking.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        super();
        this.productDao = productDao;
    }

    @Override
    public DataResult<List<Product>> getAll() {
        List<Product> products = this.productDao.findAll();
        return new SuccessDataResult<>(products, "Data listed");
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Product is added.");
    }

    @Override
    public DataResult<Product> getById(int id) {
        Product product = this.productDao.getById(id);
        if (product != null) {
            return new SuccessDataResult<>(product, "Data listed");
        } else {
            return new ErrorDataResult<>("Product not found.");
        }
    }

    @Override
    public DataResult<Product> save(Product product) {
        Product savedProduct = productDao.save(product);
        return new SuccessDataResult<>(savedProduct, "Product saved successfully.");
    }

    @Override
    public Result deleteById(int id) {
        try {
            productDao.deleteById(id);
            return new SuccessResult("Product deleted successfully.");
        } catch (Exception e) {
            return new ErrorResult("Failed to delete product.");
        }
    }

    @Override
    public DataResult<List<Product>> findByCategory(String category) {
        List<Product> products = productDao.findByCategory(category);
        if (!products.isEmpty()) {
            return new SuccessDataResult<>(products, "Products found for category: " + category);
        } else {
            return new ErrorDataResult<>("No products found for category: " + category);
        }
    }

    @Override
    public DataResult<List<Product>> filterByPrice(double minPrice, double maxPrice) {
        List<Product> products = productDao.findByPriceBetween(minPrice, maxPrice);
        if (!products.isEmpty()) {
            return new SuccessDataResult<>(products, "Products found within price range.");
        } else {
            return new ErrorDataResult<>("No products found within specified price range.");
        }
    }
}
