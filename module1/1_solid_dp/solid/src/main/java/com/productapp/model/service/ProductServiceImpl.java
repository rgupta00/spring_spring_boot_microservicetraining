package com.productapp.model.service;

import com.productapp.exceptions.DataAcessException;
import com.productapp.model.dao.ProductDao;
import com.productapp.model.dao.ProductDaoImplJdbc;
import com.productapp.model.dto.Product;
import com.productapp.util.Validation;

import java.sql.SQLException;

public class ProductServiceImpl implements ProductService{

    private ProductDao productDao;
    private Validation validation;
    public ProductServiceImpl(){
        productDao=new ProductDaoImplJdbc();
        validation=new Validation();
    }
    @Override
    public void addProduct(Product product)  {
        if(validation.isValid(product)) {
            productDao.addProduct(product);
        }else
            throw new RuntimeException();
    }
}
