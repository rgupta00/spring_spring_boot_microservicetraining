package com.productapp.controller;

import com.productapp.entities.Product;
import com.productapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//REST?
//I WANT TO CONTROL STATUS CODE OF RESPONSE?
// ResponseEnity
//I WANT TO COVER EXCEPTOIN HANDING CASE?
@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    //-----------getting all products-------------
//    @GetMapping(path = "products")
//    public List<Product> getAll(){
//        return productService.getAll();
//    }

    @GetMapping(path = "products")
    public ResponseEntity<List<Product>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(productService.getAll());
    }

    //-----------getting one product by id-------------

    //@RequestParam pagination //http://localhost:8080/products?

    //http://localhost:8080/products/x
    @GetMapping(path = "products/{productId}")
    public Product getById( @PathVariable(name ="productId" ) int productId){
        return productService.getProductById(productId);
    }

    //-----------adding new products----jakson parser : conver java <--> java ---------
    @PostMapping(path = "products")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.addProduct(product));
    }
    //-----------update an product-------------

    @PutMapping(path = "products/{productId}")
    public ResponseEntity<Product> updateProduct(@PathVariable(name = "productId")  int productId,   @RequestBody Product product){
        System.out.println("-----------------------"+productId);
        return ResponseEntity.status(HttpStatus.OK).body(productService.updateProduct(productId, product));
    }

    //-----------delete an product-------------
    @DeleteMapping(path = "products/{productId}")
    public ResponseEntity<Void> deleteById( @PathVariable(name ="productId" ) int productId){
         productService.deleteProduct(productId);
         return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}





















