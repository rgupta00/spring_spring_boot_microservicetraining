package com.productapp.model.dao;

import com.productapp.exceptions.DataAcessException;
import com.productapp.exceptions.HibernateException;
import com.productapp.model.dto.Product;

import java.sql.SQLException;

public class ProductDaoImplHib implements ProductDao{

    @Override
    public void addProduct(Product product) throws DataAcessException {

        System.out.println("hib imp...");
        try{
            if(1==1)
                throw new HibernateException("some hib prob");
        }catch (HibernateException ex){
            throw new DataAcessException("some hi issue");
        }

    }
}
