package com.example.cartservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    @GetMapping("/cart")
    public String getCart() {
        return "Cart Service - Your cart is available";
    }

    @GetMapping("/cart/1")
    public String getCartItem() {
        return "Cart Item 1 - Laptop";
    }
}