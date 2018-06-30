package com.pearson.k12x.product.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pearson.k12x.model.spring.Product;
import com.pearson.k12x.model.spring.ProductModel;
import com.pearson.k12x.product.service.impl.ProductServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "Product Resource", description = "Api's related to Product")
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductServiceImpl productService;
	
	@ApiOperation(value = "Get All Products",
			notes = "Get all products")
	@ApiResponses(value = {
		@ApiResponse(code = 100, message = "100 is the message"),
		@ApiResponse(code = 200, message = "Successful")
	})
	@GetMapping
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}
	
	
	@ApiOperation(value = "Get Product",
			notes = "Get Product Based On id")
	@ApiResponses(value = {
		@ApiResponse(code = 100, message = "100 is the message"),
		@ApiResponse(code = 200, message = "Successful")
	})
	@GetMapping("/{id}")
	public Optional<Product> getProduct(@PathVariable("id") String id) {
		return productService.getProduct(id);
	}
	
	
	@ApiOperation(value = "Add Product",
			notes = "Add Product")
	@ApiResponses(value = {
		@ApiResponse(code = 100, message = "100 is the message"),
		@ApiResponse(code = 200, message = "Successful")
	})
	@PostMapping()
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	
	@ApiOperation(value = "Update Product",
			notes = "Update Product Based On id")
	@ApiResponses(value = {
		@ApiResponse(code = 100, message = "100 is the message"),
		@ApiResponse(code = 200, message = "Successful")
	})
	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable("id") String id, @RequestBody Product product) {
		return productService.updateProduct(id, product);
	}
	
	
	@ApiOperation(value = "Get Product Models",
			notes = "Get Product Models")
	@ApiResponses(value = {
		@ApiResponse(code = 100, message = "100 is the message"),
		@ApiResponse(code = 200, message = "Successful")
	})
	@GetMapping("/productmodel")
	public ProductModel[] getProductModels() {
		return productService.getProductModels();
	}
	
	
	@ApiOperation(value = "Get Product Model",
			notes = "Get Product Model Based On id")
	@ApiResponses(value = {
		@ApiResponse(code = 100, message = "100 is the message"),
		@ApiResponse(code = 200, message = "Successful")
	})
	@GetMapping("/productmodel/{id}")
	public ProductModel getProductModelById(@PathVariable("id") String id) {
		return productService.getProductModelById(id);
	}
}

