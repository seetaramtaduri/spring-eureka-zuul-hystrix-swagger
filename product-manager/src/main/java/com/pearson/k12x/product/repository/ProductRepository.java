package com.pearson.k12x.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pearson.k12x.model.spring.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}
