package com.productappclient.proxyservice;

import com.productappclient.dto.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "productservice", url = "http://localhost:8080/products/")
public interface ProductServiceProxy {
    @GetMapping(path = "{id}")
    public Product getById(@PathVariable(name = "id") int id);
}
