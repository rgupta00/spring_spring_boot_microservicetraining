package com.productapp;

import com.productapp.entities.Product;
import com.productapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import javax.sql.DataSource;
import java.math.BigDecimal;

@SpringBootApplication
public class Productapp01Application implements CommandLineRunner {

	@Autowired
	private ProductRepo productRepo;


	public static void main(String[] args) {
		SpringApplication.run(Productapp01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("adding 2 records");
		productRepo.save(new Product("dell laptop X2", new BigDecimal(120000)));
		productRepo.save(new Product("laptop cleaner", new BigDecimal(120)));
	}
}
