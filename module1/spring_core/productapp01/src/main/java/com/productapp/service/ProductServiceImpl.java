package com.productapp.service;
//SR+NFR
//working + logging/cahing/tx/sec/exhannding
import com.productapp.dao.ProductDao;
import com.productapp.dto.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "productservice")
public class ProductServiceImpl implements ProductService{

    private ProductDao productDao;
    private Logger logger= LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        long start=System.currentTimeMillis();
        logger.info("get all is called");
        List<Product> products= productDao.getAll();
        long end=System.currentTimeMillis();
        logger.info("method getAll() take :"+ (end-start)+" ms");
        return products;
    }
}




