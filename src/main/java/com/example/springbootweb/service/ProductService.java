package com.example.springbootweb.service;

import com.example.springbootweb.model.Product;
import com.example.springbootweb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    /*private final List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Iphone 13 mini", 40000),
            new Product(102, "Samsung s27", 90000),
            new Product(103, "Kiddy Bag", 20000)));*/

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(new Product());
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
