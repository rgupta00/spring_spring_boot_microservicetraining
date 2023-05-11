package com.productapp;

//import com.productapp.config.AppConfig;
import com.productapp.model.dto.Product;
import com.productapp.model.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ApplicationContext ctx=new AnnotationConfigApplicationContext(DemoApplication.class);
		ProductService productService=ctx.getBean("productservice",ProductService.class);

		List<Product> products=productService.getAll();

	}

}
