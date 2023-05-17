package com.productappclient.controller;

import com.productappclient.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductClientController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("productclient/{id}")
    public Product getByIdClient(@PathVariable int id){
        //http://localhost:8080/products/2
        return  restTemplate.getForObject("http://localhost:8080/products/"+id , Product.class);
    }
}
