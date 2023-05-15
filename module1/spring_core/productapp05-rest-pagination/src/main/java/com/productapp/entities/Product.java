package com.productapp.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

//hibernate is a framework that do jdbc under the hood
@Entity
@Table(name = "product_table2")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    @NotEmpty(message = "{product.name.absent}")
    private String name;

    @Column(nullable = false)
   @NotNull(message = "{product.price.absent}")
   @Range(min = 10, max = 150000, message = "{product.price.invalid}")
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
