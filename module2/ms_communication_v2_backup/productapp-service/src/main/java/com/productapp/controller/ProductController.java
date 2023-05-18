package com.productapp.controller;

import com.productapp.dto.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ProductController {

    @Value("${server.port}")
    public int portNo;

    @GetMapping("products/{id}")
    public Product getById(@PathVariable int id){
        return new Product(id,"product "+ id,
                new Random().nextInt(10000)+60000,portNo);

    }
}
