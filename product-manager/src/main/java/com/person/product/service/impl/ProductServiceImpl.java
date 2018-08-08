package com.person.product.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.person.model.spring.Product;
import com.person.model.spring.ProductModel;
import com.person.product.repository.ProductRepository;
import com.person.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<Product> getAllProducts() {
		List<Product> productList = new ArrayList<>();
		try {
			productRepository.findAll().forEach(productList::add);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			throw e;
		}
		return productList;
	}
	
	@Override
	public Optional<Product> getProduct(String id) {
		Optional<Product> productResponse = null;
		try {
			productResponse = productRepository.findById(id);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			throw e;
		}
		return productResponse;
	}
	
	@Override
	public Product addProduct(Product product) {
		Product productResponse = null;
		try {
			productResponse = productRepository.save(product);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			throw e;
		}
		return productResponse;
	}
	
	@Override
	public Product updateProduct(String id, Product product) {
		Product productResponse = null;
		try {
			boolean isAvailable = productRepository.existsById(id);
			if (isAvailable) {
				product.setId(id);
				productResponse = productRepository.save(product);
			} else {
				throw new RuntimeException("Product not found");
			}
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			throw e;
		}
		return productResponse;
	}
	
	@HystrixCommand(
			fallbackMethod = "fallback",
			groupKey = "Product",
			commandKey = "productModels",
			threadPoolKey = "productModelsThread"
	)
	@Override
	public ProductModel[] getProductModels() {
		ProductModel[] productmodelResponse = null;
		try {
			productmodelResponse = restTemplate.getForObject("http://product-model-manager/productmodel", ProductModel[].class);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			throw e;
		}
		return productmodelResponse;
	}
	
	@HystrixCommand(
			fallbackMethod = "fallback",
			groupKey = "Product",
			commandKey = "productModelById",
			threadPoolKey = "productModelByIdThread"
	)
	@Override
	public ProductModel getProductModelById(String id) {
		ProductModel productmodelResponse = null;
		try {
			productmodelResponse = restTemplate.getForObject("http://product-model-manager/productmodel/" + id, ProductModel.class);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
			throw e;
		}
		return productmodelResponse;
	}
	
	public ProductModel[] fallback(Throwable hystrixException) {
		throw new RuntimeException(hystrixException.getMessage());
	}
	
	public ProductModel fallback(String id, Throwable hystrixException) {
		throw new RuntimeException(hystrixException.getMessage());
	}
}
