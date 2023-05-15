package com.productapp.service;
//SR+NFR
//working + logging/cahing/tx/sec/exhannding
import com.productapp.entities.Product;
import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.repo.ProductRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "productservice")
public class ProductServiceImpl implements ProductService{

    private ProductRepo productRepo;

    private Logger logger= LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public List<Product> getAll() {
        long start=System.currentTimeMillis();
        logger.info("get all is called");
        List<Product> products= productRepo.findAll();
        long end=System.currentTimeMillis();
        logger.info("method getAll() take :"+ (end-start)+" ms");
        return products;
    }

    @Override
    public Product addProduct(Product product) {
        productRepo.save(product);
        return product;
    }

    @Override
    public Product updateProduct(int productId, Product product) {
        Product productToUpdate=getProductById(productId);
        productToUpdate.setPrice(product.getPrice());
        //update vs add : method remain same save
        productRepo.save(productToUpdate);
        return productToUpdate;
    }

    @Override
    public Product deleteProduct(int productId) {
        Product productToDelete=getProductById(productId);
        productRepo.delete(productToDelete);
        return productToDelete;
    }

    @Override
    public Product getProductById(int productId) {
        Product product=productRepo.findById(productId)
                .orElseThrow(()-> new ProductNotFoundException("product is not found!"));
        return product;
    }
}




