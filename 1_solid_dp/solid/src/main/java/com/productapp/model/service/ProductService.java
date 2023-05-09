package com.productapp.model.service;

import com.productapp.exceptions.DataAcessException;
import com.productapp.model.dto.Product;

import java.sql.SQLException;

public interface ProductService {
    public void addProduct(Product product);
}
