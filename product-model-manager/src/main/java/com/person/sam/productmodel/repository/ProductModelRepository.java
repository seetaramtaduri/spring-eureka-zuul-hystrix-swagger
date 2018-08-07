package com.person.sam.productmodel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.person.sam.model.spring.ProductModel;

@Repository
public interface ProductModelRepository extends MongoRepository<ProductModel, String> {

}
