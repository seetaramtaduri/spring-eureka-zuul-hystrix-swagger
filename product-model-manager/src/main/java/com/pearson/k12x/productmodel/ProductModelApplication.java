package com.pearson.k12x.productmodel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProductModelApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductModelApplication.class, args);
	}
}
