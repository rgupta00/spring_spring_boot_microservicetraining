package com.productapp.exceptions;
//exception handling in core: custom/user define ex exception
public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String message) {
        super(message);
    }
}
