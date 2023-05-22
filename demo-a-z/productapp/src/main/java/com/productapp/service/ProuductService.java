package com.productapp.service;
import com.productapp.entities.Product;

import  java.util.*;
public interface ProuductService {

    public List<Product> getAll();
    public Product getById(int productId);
    public Product addProduct(Product product);
    public Product updateProduct(int productId, Product product);
    public Product deleteProduct(int productId);

    public List<Product> getAllByName(String productName);


}
