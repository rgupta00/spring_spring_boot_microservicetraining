package com.productapp.model.dao;

import com.productapp.exceptions.DataAcessException;
import com.productapp.model.dto.Product;
import com.productapp.util.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDaoImplJdbc implements ProductDao{

    private Connection connection;

    public ProductDaoImplJdbc() {
       this.connection=DbConnection.getConnection();
    }

    @Override
    public void addProduct(Product product) throws DataAcessException {
        System.out.println("jdbc imp...");
       try{
           PreparedStatement pstmt = connection.prepareStatement("insert into product(name,price) values(?,?)");
           pstmt.setString(1, product.getName());
           pstmt.setDouble(2, product.getPrice());

           pstmt.executeUpdate();
           System.out.println("adding product to db using jdbc..");
       }catch (SQLException e){
           throw  new DataAcessException("some jdbc problem");
       }
    }
}
