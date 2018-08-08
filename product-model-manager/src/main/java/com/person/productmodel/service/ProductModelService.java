package com.person.productmodel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.person.model.spring.ProductModel;

@Service
public interface ProductModelService {
	
	List<ProductModel> getAllProductModels();
	
	Optional<ProductModel> getProductModel(String id);
	
	ProductModel addProductModel(ProductModel productModel);
	
	ProductModel updateProductModel(String id, ProductModel productModel);
}
