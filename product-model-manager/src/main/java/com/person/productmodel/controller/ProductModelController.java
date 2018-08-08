package com.person.productmodel.controller;

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

import com.person.model.spring.ProductModel;
import com.person.productmodel.service.impl.ProductModelServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "Product Model Resource", description = "Api's related to Product Model")
@RequestMapping("/productmodel")
public class ProductModelController {
	
	@Autowired
	ProductModelServiceImpl productModelService;
	
	@ApiOperation(value = "Get All Product Models",
			notes = "Get All Product Models")
	@ApiResponses(value = {
		@ApiResponse(code = 100, message = "100 is the message"),
		@ApiResponse(code = 200, message = "Successful")
	})
	@GetMapping
	public List<ProductModel> getAllProductModels() {
		return productModelService.getAllProductModels();
	}
	
	
	@ApiOperation(value = "Get Product Model",
			notes = "Get Product Model Based On id")
	@ApiResponses(value = {
		@ApiResponse(code = 100, message = "100 is the message"),
		@ApiResponse(code = 200, message = "Successful")
	})
	@GetMapping("/{id}")
	public Optional<ProductModel> getProductModel(@PathVariable("id") String id) {
		return productModelService.getProductModel(id);
	}
	
	
	@ApiOperation(value = "Add Product Model",
			notes = "Add Product Model")
	@ApiResponses(value = {
		@ApiResponse(code = 100, message = "100 is the message"),
		@ApiResponse(code = 200, message = "Successful")
	})
	@PostMapping()
	public ProductModel addProductModel(@RequestBody ProductModel productModel) {
		return productModelService.addProductModel(productModel);
	}
	
	
	@ApiOperation(value = "Update Product Model",
			notes = "Update Product Model Based On id")
	@ApiResponses(value = {
		@ApiResponse(code = 100, message = "100 is the message"),
		@ApiResponse(code = 200, message = "Successful")
	})
	@PutMapping("/{id}")
	public ProductModel updateProductModel(@PathVariable("id") String id, @RequestBody ProductModel productModel) {
		return productModelService.updateProductModel(id, productModel);
	}
}

