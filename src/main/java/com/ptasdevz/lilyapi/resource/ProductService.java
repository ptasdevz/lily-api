package com.ptasdevz.lilyapi.resource;

import com.ptasdevz.lilyapi.document.Product;
import com.ptasdevz.lilyapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public Product getOneProduct(Integer id){
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> getProductsByCategory(Integer catId){return  productRepository.getProductByCategoryId(catId);}
}
