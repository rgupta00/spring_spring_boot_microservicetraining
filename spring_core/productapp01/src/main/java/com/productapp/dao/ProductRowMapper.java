package com.productapp.dao;

import com.productapp.dto.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
//teaching spring how to convert rs(resultset) to object : that is the job of row mapper
public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
       return   new Product(rs.getInt(1), rs.getString(2), rs.getBigDecimal(3));

    }
}
