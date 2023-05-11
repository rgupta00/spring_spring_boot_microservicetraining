package com.productapp.dao;

import com.productapp.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
@Primary
//@Profile("test")
public class ProductDaoImplJdbcTemplate implements ProductDao{

    private JdbcTemplate jdbcTemplate;
    @Autowired
    public ProductDaoImplJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Product> getAll() {
        return jdbcTemplate.query("select * from product",new ProductRowMapper());
    }
}
