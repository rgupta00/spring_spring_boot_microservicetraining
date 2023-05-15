package com.productapp.model.dao;

import com.productapp.model.dto.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
//  dev     test        preprod     prod
@Repository
//@Profile("dev")
public class ProductDaoImplArrayList implements ProductDao{
    @Override
    public List<Product> getAll() {
        System.out.println("----using arraylist-------------");
        List<Product> list=new ArrayList<>();
        list.add(new Product(1,"laptop", new BigDecimal(78000)));
        list.add(new Product(2,"laptop coolpad", new BigDecimal(1780)));
        list.add(new Product(3,"TV", new BigDecimal(71000)));
        return list;
    }
}
