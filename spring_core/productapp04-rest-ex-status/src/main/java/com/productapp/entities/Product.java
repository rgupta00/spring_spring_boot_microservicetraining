package com.productapp.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

//hibernate is a framework that do jdbc under the hood
@Entity
@Table(name = "product_table2")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
//    @Column(nullable = false)
    private String name;

   // @Column(nullable = false)
    private BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}
