package com.productapp.model.dao;

import com.productapp.model.dto.Product;

import java.util.List;

public interface ProductDao {
    public List<Product> getAll();
}
