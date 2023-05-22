package com.productapp.exceptions;

public class ProductNotFoundExcption extends RuntimeException{

    public ProductNotFoundExcption(String message) {
        super(message);
    }
}
