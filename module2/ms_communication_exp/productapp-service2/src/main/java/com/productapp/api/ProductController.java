package com.productapp.api;

import com.productapp.dto.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ProductController {

    @Value("${server.port}")
    private int port;

    @GetMapping(path = "products/{id}")
    public Product getById(@PathVariable(name = "id") int id){
        return new Product(id, "laptop "+ id , new Random().nextInt(10000)+60000,port);
    }
}
