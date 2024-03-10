package com.example.ordertracking.api.controllers;

import com.example.ordertracking.business.abstracts.ProductService;
import com.example.ordertracking.core.utilities.DataResult;
import com.example.ordertracking.core.utilities.Result;
import com.example.ordertracking.core.utilities.SuccessDataResult;
import com.example.ordertracking.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public ResponseEntity<DataResult<List<Product>>> getAllProducts() {
        DataResult<List<Product>> result = productService.getAll();
        return ResponseEntity.ok(result);
    }

    @PostMapping("/add")
    public ResponseEntity<Result> addProduct(@RequestBody Product product) {
        Result result = productService.add(product);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DataResult<Product>> getProductById(@PathVariable int id) {
        DataResult<Product> result = productService.getById(id);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/save")
    public ResponseEntity<DataResult<Product>> saveProduct(@RequestBody Product product) {
        DataResult<Product> result = productService.save(product);
        return ResponseEntity.ok(result);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Result> deleteProductById(@PathVariable Integer id) {
        Result result = productService.deleteById(id);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<DataResult<List<Product>>> getProductsByCategory(@PathVariable String category) {
        DataResult<List<Product>> result = productService.findByCategory(category);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/filter")
    public ResponseEntity<DataResult<List<Product>>> filterProductsByPrice(@RequestParam double minPrice, @RequestParam double maxPrice) {
        DataResult<List<Product>> result = productService.filterByPrice(minPrice, maxPrice);
        return ResponseEntity.ok(result);
    }
}
