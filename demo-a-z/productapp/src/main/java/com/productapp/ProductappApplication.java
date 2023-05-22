package com.productapp;

import com.productapp.entities.Product;
import com.productapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class ProductappApplication implements CommandLineRunner {

	@Autowired
	private ProductRepo productRepository;

	public static void main(String[] args) {

		SpringApplication.run(ProductappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		productRepository.save(new Product("Dell laptop", new BigDecimal(78000), "EL"));
		productRepository.save(new Product("laptop stand", new BigDecimal(780), "EL"));
		productRepository.save(new Product("Rich dad poor dad", new BigDecimal(200), "BOOK"));


	}
}
