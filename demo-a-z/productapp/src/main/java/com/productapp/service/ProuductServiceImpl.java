package com.productapp.service;

import com.productapp.entities.Product;
import com.productapp.exceptions.ProductNotFoundExcption;
import com.productapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
//Service layer = BL+ CCC(sec, tx mgt logging )
@Service
@Transactional
public class ProuductServiceImpl implements ProuductService{

    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> getAll() {
        return productRepo.findAll();
    }

    @Override
    public Product getById(int productId) {
        return productRepo.findById(productId)
                .orElseThrow(()-> new ProductNotFoundExcption("product with id "+ productId+" is not found"));
    }

    @Override
    public Product addProduct(Product product) {
        productRepo.save(product);
        return null;
    }

    @Override
    public Product updateProduct(int productId, Product product) {
        Product productToUpdate= getById(productId);
        productToUpdate.setProductPrice(product.getProductPrice());
        productRepo.save(productToUpdate);

        return productToUpdate;
    }

    @Override
    public Product deleteProduct(int productId) {
        Product productToDelete= getById(productId);
        productRepo.delete(productToDelete);
        return productToDelete;
    }

    @Override
    public List<Product> getAllByName(String productName) {
        return productRepo.findByProductName(productName);
    }
}
