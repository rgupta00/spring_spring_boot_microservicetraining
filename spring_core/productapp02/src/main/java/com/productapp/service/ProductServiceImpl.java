package com.productapp.service;
//SR+NFR
//working + logging/cahing/tx/sec/exhannding
import com.productapp.entities.Product;
import com.productapp.repo.ProductRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "productservice")
public class ProductServiceImpl implements ProductService{

    private ProductRepo productRepo;

    private Logger logger= LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public List<Product> getAll() {
        long start=System.currentTimeMillis();
        logger.info("get all is called");
        List<Product> products= productRepo.findAll();
        long end=System.currentTimeMillis();
        logger.info("method getAll() take :"+ (end-start)+" ms");
        return products;
    }
}




