package com.example.productservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/products")
    public String getProducts() {
        return "Product Service - Products are available";
    }

    @GetMapping("/products/1")
    public String getProduct() {
        return "Product 1 - Laptop";
    }
}