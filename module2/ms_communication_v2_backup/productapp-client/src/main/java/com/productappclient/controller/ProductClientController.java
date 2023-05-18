package com.productappclient.controller;

import com.productappclient.dto.DiscountInfo;
import com.productappclient.dto.Product;
import com.productappclient.service.ProductServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ProductClientController {

    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    private ProductServiceProxy productServiceProxy;

    @GetMapping("productclient/{id}")
    public Product getByIdClient(@PathVariable int id){

        Product product  =restTemplate.getForObject( "http://PRODUCTAPP-SERVICE/products/"+id ,
                Product.class);
        // i need to call another service that return me discounted price if i send the discount coupon

        //PRODUCTDISCOUNT-SERVICE
        DiscountInfo discountInfo=restTemplate.
                getForObject("http://PRODUCTDISCOUNT-SERVICE/discount/ES1", DiscountInfo.class);

//        return productServiceProxy.getById(id);
                //10
                //200
        //correct the logic
        int discountedPrice= product.getPrice()-discountInfo.getDiscountPercentage();
        product.setDiscountedPrice(discountedPrice);
        return  product;
    }

}




//discoveryClient help you to get instance of client , dont support load balancing
//    @Autowired
//    private DiscoveryClient discoveryClient;
//
//    @Autowired
//    private LoadBalancerClient loadBalancerClient;



//http://localhost:8080/products/2
//        return  restTemplate.getForObject("http://localhost:8080/products/"+id ,
//                Product.class);

//load balancing is applied ...
//        ServiceInstance instance=loadBalancerClient.choose("PRODUCTAPP-SERVICE");
//
//        String uri= instance.getUri().toString();







