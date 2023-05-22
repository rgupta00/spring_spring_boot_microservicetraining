package com.productapp.api;

import com.productapp.entities.Product;
import com.productapp.service.ProuductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "api")
public class ProductApi {

    @Autowired
    private ProuductService prouductService;

    //200
    @GetMapping(path = "products")
    public ResponseEntity<List<Product>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(prouductService.getAll());
    }


    //200
    @GetMapping(path = "products2")
    public ResponseEntity<Map<String,Object>> getAll2(){
        HashMap<String, Object> map=new HashMap<>();
        map.put("data", prouductService.getAll());
        map.put("message","successful");

        return ResponseEntity.status(HttpStatus.OK).body(map);
    }


    //200
    @GetMapping(path = "products/{productId}")
    public ResponseEntity<Product> getById(@PathVariable int productId){
        return ResponseEntity.status(HttpStatus.OK).body(prouductService.getById(productId));
    }

    //204
    @DeleteMapping(path = "products/{productId}")
    public ResponseEntity<Void> deleteById(@PathVariable int productId){
         prouductService.deleteProduct(productId);
         return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


    @PutMapping(path = "products/{productId}")
    public ResponseEntity<Product> updateProduct(@PathVariable int productId, @RequestBody Product product){
        return ResponseEntity.status(HttpStatus.OK).body(prouductService.updateProduct(productId, product));
    }

    @PostMapping(path = "products")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        return ResponseEntity.status(HttpStatus.CREATED).body(prouductService.addProduct(product));
    }
}
