package com.productapp.model.dao;

import com.productapp.exceptions.DataAcessException;
import com.productapp.model.dto.Product;

import java.sql.SQLException;

public interface ProductDao {
    public void addProduct(Product product) throws DataAcessException;
}
