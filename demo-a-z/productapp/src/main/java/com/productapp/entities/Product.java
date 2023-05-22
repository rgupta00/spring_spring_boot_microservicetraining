package com.productapp.entities;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "product_table")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;


    private String productName;
    private BigDecimal productPrice;
    private String productCat;

    public Product(String productName, BigDecimal productPrice, String productCat) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCat = productCat;
    }
}
