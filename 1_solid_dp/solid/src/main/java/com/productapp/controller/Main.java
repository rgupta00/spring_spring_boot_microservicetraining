package com.productapp.controller;

import com.productapp.model.dto.Product;
import com.productapp.model.service.ProductService;
import com.productapp.model.service.ProductServiceImpl;

public class Main {
    public static void main(String[] args) {
        ProductService productService=new ProductServiceImpl();
        Product product=new Product("cool pad laptop",590);
        productService.addProduct(product);
    }
}
