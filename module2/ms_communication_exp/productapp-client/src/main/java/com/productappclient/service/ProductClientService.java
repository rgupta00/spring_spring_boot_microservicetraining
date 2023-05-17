package com.productappclient.service;

import com.productappclient.dto.Product;
import com.productappclient.proxyservice.ProductServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductClientService {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private ProductServiceProxy productClientProxy;

    public Product getProductById(int id){
        //CRUD operation, code is heavy non block io* vs WebClient
        //Open feign: to declare rest client
       // return restTemplate.getForObject("http://localhost:8080/products/"+id , Product.class);

        return  productClientProxy.getById(id);
    }

}
