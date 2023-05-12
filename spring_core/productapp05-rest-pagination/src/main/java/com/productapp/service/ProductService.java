package com.productapp.service;

import com.productapp.entities.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {
    //all the products
    public List<Product> getAll();
    //all but sorted
    public List<Product> getAllSortedBy(String field);

    public Page<Product> getByPage(int offset , int pageSize);

    public Page<Product> getByPageAndSoted(int offset , int pageSize,String field);

    public Product addProduct(Product product);

    public Product updateProduct(int productId, Product product);

    public Product deleteProduct(int productId);

    public Product getProductById(int productId);
}
