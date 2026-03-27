package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public ProductService() {
        // Tạo sẵn dữ liệu mẫu
        products.add(new Product(1, "iPhone 15", 1000));
        products.add(new Product(2, "Samsung S24", 900));
    }

    public ProductService(List<Product> product) {
        this.products = product;
    }

    public List<Product> getAllProduct() {
        return products;
    }
}
