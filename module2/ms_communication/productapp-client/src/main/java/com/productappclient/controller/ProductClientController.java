package com.productappclient.controller;

import com.productappclient.dto.Product;
import com.productappclient.service.ProductClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductClientController {

    @Autowired
    private ProductClientService productClientService;

    @GetMapping(path = "productsclient/{id}")
    public Product getById( @PathVariable(name = "id") int id){
        return productClientService.getProductById(id);
    }
}
