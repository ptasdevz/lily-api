package com.ptasdevz.lilyapi.repository;

import com.ptasdevz.lilyapi.document.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product,Integer> {
    List<Product> getProductByCategoryId(Integer catId);
}
