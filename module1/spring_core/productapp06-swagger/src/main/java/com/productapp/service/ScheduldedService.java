package com.productapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

//HashMap K, V
@Service
public class ScheduldedService {

    @Autowired
    private ProductService productService;

    @Scheduled(initialDelay = 1000, fixedRate = 2000)
    public void fixedRateJob(){
        System.out.println("cache is evicted ...:"+ productService.getAll().size());
        productService.evictCache();
    }
}
