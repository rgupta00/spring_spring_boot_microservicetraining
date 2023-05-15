package com.productapp.dto;

import com.productapp.entities.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductResponse {
    private boolean success;
    private Product product;
    private String message;

}
