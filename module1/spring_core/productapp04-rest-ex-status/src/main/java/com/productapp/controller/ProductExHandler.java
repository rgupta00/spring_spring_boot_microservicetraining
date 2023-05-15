package com.productapp.controller;

import com.productapp.dto.ErrorInfo;
import com.productapp.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ProductExHandler {


//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<ErrorInfo> handle500(Exception ex){
//        ErrorInfo errorInfo=new ErrorInfo();
//
//        errorInfo.setStartTime(LocalDateTime.now());
//        errorInfo.setToContect("raj@foo.com");
//        errorInfo.setErrorMessage(ex.getMessage());
//        errorInfo.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.toString());
//
//        return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorInfo);
//    }

    //as soon as ex is happing in findById in cotroller layer...transfer happens automatically
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorInfo> handle404(ProductNotFoundException ex){
        ErrorInfo errorInfo=new ErrorInfo();

        errorInfo.setStartTime(LocalDateTime.now());
        errorInfo.setToContect("raj@foo.com");
        errorInfo.setErrorMessage(ex.getMessage());
        errorInfo.setStatusCode(HttpStatus.NOT_FOUND.toString());

        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorInfo);
    }

//    @ExceptionHandler(ProductNotFoundException.class)
//    public ResponseEntity<ErrorInfo> handle400(ProductNotFoundException ex){
//        ErrorInfo errorInfo=new ErrorInfo();
//
//        errorInfo.setStartTime(LocalDateTime.now());
//        errorInfo.setToContect("raj@foo.com");
//        errorInfo.setErrorMessage(ex.getMessage());
//        errorInfo.setStatusCode(HttpStatus.NOT_FOUND.toString());
//
//        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorInfo);
//    }
}
