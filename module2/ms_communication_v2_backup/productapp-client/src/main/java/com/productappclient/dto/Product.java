package com.productappclient.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int id ;
    private String name;

    private int price;

    private int port;
    private int discountedPrice;
}
