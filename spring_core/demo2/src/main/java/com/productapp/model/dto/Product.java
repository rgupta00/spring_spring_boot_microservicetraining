package com.productapp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
    private  int id;
    private String name;
    private BigDecimal price;


}
