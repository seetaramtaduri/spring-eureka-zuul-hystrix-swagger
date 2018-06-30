package com.pearson.k12x.productmodel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pearson.k12x.model.spring.ProductModel;

@Repository
public interface ProductModelRepository extends MongoRepository<ProductModel, String> {

}
