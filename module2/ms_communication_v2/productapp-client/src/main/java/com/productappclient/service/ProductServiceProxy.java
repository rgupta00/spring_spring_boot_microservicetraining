package com.productappclient.service;

import com.productappclient.dto.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//OpenFeign is a declaritve rest client
@FeignClient("PRODUCTAPP-SERVICE")
public interface ProductServiceProxy {
    @GetMapping("products/{id}")
    public Product getById(@PathVariable int id);
}
