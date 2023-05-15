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
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@SpringBootApplication
public class Productapp01Application implements CommandLineRunner {
	@Autowired
	private ProductRepo productRepo;


	public static void main(String[] args) {
		SpringApplication.run(Productapp01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//adding many produts
//		List<Product> products= IntStream.
//				rangeClosed(1,2000)
//				.mapToObj(i->
//						new Product("product "+ i, new Random().nextDouble(20000)))
//				.toList();
//		productRepo.saveAll(products);
		System.out.println("--------------------");

		productRepo.save(new Product("dell laptop X2", 12000));
		productRepo.save(new Product("laptop cleaner", 120));

	}
}
