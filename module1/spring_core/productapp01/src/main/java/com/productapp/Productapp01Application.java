package com.productapp;

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
//i dont to configure ds from you
@SpringBootApplication
// (exclude = {DataSourceAutoConfiguration.class,
//		DataSourceTransactionManagerAutoConfiguration.class})
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan
public class Productapp01Application implements CommandLineRunner {
//
//	@Autowired
//	private DataSource dataSource;

	//handy tech in spring boot CommandLineRunner: if u want to do something just after ur spring project is stared
	public static void main(String[] args) {
		SpringApplication.run(Productapp01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		if(dataSource!=null){
//			System.out.println("-----------------done----------");
//		}else
//			System.out.println("-----------------not done----------");
	}
}
