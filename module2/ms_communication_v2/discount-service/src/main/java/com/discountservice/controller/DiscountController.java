package com.discountservice.controller;

import com.discountservice.dto.DiscountInfo;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class DiscountController {
    @GetMapping(path = "discount/{discountCoupon}")
    public DiscountInfo getDiscountInfo(@PathVariable String discountCoupon){
        return new DiscountInfo(discountCoupon, new Random().nextInt(20));
    }
}
