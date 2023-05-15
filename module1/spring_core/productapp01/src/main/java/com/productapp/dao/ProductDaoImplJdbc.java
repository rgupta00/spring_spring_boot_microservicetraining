package com.productapp.dao;

import com.productapp.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Repository
//@Profile("test")
public class ProductDaoImplJdbc implements ProductDao{

    private DataSource dataSource;

    @Autowired
    public ProductDaoImplJdbc(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Product> getAll() {
        System.out.println("----using jdbc-------------");
        List<Product> list=new ArrayList<>();
        //how to write jdbc code?
        Connection connection=null;
       try{
            connection=dataSource.getConnection();
           PreparedStatement pstmt=connection.prepareStatement("select * from product");
           ResultSet rs=pstmt.executeQuery();
           while (rs.next()){
               list.add(new Product(rs.getInt(1), rs.getString(2), rs.getBigDecimal(3)));
           }
       }catch (SQLException ex){
           ex.printStackTrace();
       }finally {
           try{
               connection.close();
           }catch (SQLException ex){
               ex.printStackTrace();
           }
       }
        return list;
    }
}
