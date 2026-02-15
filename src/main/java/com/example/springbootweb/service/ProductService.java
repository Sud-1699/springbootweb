package com.example.springbootweb.service;

import com.example.springbootweb.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Iphone 13 mini", 40000),
            new Product(102, "Samsung s27", 90000),
            new Product(103, "Kiddy Bag", 20000)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(new Product(0, null, 0));
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
