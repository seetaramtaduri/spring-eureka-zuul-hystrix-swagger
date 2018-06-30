package com.pearson.k12x.productmodel.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pearson.k12x.model.spring.ProductModel;
import com.pearson.k12x.productmodel.repository.ProductModelRepository;
import com.pearson.k12x.productmodel.service.ProductModelService;

@Service
public class ProductModelServiceImpl implements ProductModelService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductModelServiceImpl.class);
	
	@Autowired
	private ProductModelRepository productModelRepository;

	@Override
	public List<ProductModel> getAllProductModels() {
		List<ProductModel> productModelList = new ArrayList<>();
		try {
			productModelRepository.findAll().forEach(productModelList::add);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			throw e;
		}
		return productModelList;
	}
	
	@Override
	public Optional<ProductModel> getProductModel(String id) {
		Optional<ProductModel> productModelResponse = null;
		try {
			productModelResponse = productModelRepository.findById(id);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			throw e;
		}
		return productModelResponse;
	}
	
	@Override
	public ProductModel addProductModel(ProductModel productModel) {
		ProductModel productModelResponse = null;
		try {
			productModelResponse = productModelRepository.save(productModel);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			throw e;
		}
		return productModelResponse;
	}
	
	@Override
	public ProductModel updateProductModel(String id, ProductModel productModel) {
		ProductModel productModelResponse = null;
		try {
			boolean isAvailable = productModelRepository.existsById(id);
			if (isAvailable) {
				productModel.setId(id);
				productModelResponse = productModelRepository.save(productModel);
			} else {
				throw new RuntimeException("ProductModel not found");
			}
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			throw e;
		}
		return productModelResponse;
	}
}
