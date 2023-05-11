package com.productapp.dao;

import com.productapp.dto.Product;

import java.util.List;

public interface ProductDao {
    //CRUD operation
    public List<Product> getAll();
}
