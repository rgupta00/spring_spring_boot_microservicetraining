package com.productapp.model.service;

import com.productapp.model.dao.ProductDao;
import com.productapp.model.dao.ProductDaoImplArrayList;
import com.productapp.model.dao.ProductDaoImplJdbc;
import com.productapp.model.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "productservice")
public class ProductServiceImpl implements ProductService{

    private ProductDao productDao;

    @Autowired
    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return productDao.getAll();
    }
}
