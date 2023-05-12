package com.productapp.controller;

import com.productapp.entities.Product;
import com.productapp.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

//REST?
//I WANT TO CONTROL STATUS CODE OF RESPONSE?
// ResponseEnity
//I WANT TO COVER EXCEPTOIN HANDING CASE?
@RestController
public class ProductController {

    private Logger logger= LoggerFactory.getLogger(ProductController.class);
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path = "products")
    public List<Product> getAll(){
        return productService.getAll();
    }

    //productsorted?field=price
    @GetMapping(path = "productsorted")
    public List<Product> getAllSorted(@RequestParam String field){
        return productService.getAllSortedBy(field);
    }
    //2000
    //productpage?offset=2&page=100
    @GetMapping(path = "productpage")
    public Page<Product> getPagesWithOffset(@RequestParam int offset,@RequestParam int page ){
        return productService.getByPage(offset, page);
    }

    //productpage?offset=2&page=100
    @GetMapping(path = "productpagesoted")
    public Page<Product> getPagesWithOffsetSorted(@RequestParam int offset,@RequestParam int page,@RequestParam String field ){
        return productService.getByPageAndSoted(offset, page, field);
    }


//    @GetMapping(path = "products", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
//    public ResponseEntity<List<Product>> getAll(){
//        logger.info("--------------getAll method is called----------------------------");
//        return ResponseEntity.status(HttpStatus.OK).body(productService.getAll());
//    }

    //-----------getting one product by id-------------

    //@RequestParam pagination //http://localhost:8080/products?

    //http://localhost:8080/products/x
    @GetMapping(path = "products/{productId}")
    public Product getById( @PathVariable(name ="productId" ) int productId){
        String k="foo value";
        logger.info("-----------------------getById method is called "+productId+":"+k);
        //i can do ex handling here and send some proper json...100+
        return productService.getProductById(productId);
    }

    //-----------adding new products----jakson parser : conver java <--> java ---------
    @PostMapping(path = "products")
    public ResponseEntity<Product> addProduct(@Valid @RequestBody Product product){
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





















