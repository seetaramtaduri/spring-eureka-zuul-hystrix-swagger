package com.pearson.k12x.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pearson.k12x.model.spring.Product;
import com.pearson.k12x.model.spring.ProductModel;

@Service
public interface ProductService {
	
	List<Product> getAllProducts();
	
	Optional<Product> getProduct(String id);
	
	Product addProduct(Product product);
	
	Product updateProduct(String id, Product product);
	
	ProductModel[] getProductModels();
	
	ProductModel getProductModelById(String id);
}
