package com.ptasdevz.lilyapi.resource;

import com.ptasdevz.lilyapi.document.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/products")
public class ProductResource {

    @Autowired
    ProductService productService;

    @GetMapping()
    public List<Product> getAll(){
        return productService.getAllProduct();
    }
    @GetMapping("/id/{id}")
    public Product getOneProduct(@PathVariable Integer id){
        return productService.getOneProduct(id);
    }

    @GetMapping("/category/{categoryId}")
    public List<Product> getProductsByCategory(@PathVariable Integer categoryId){
        return productService.getProductsByCategory(categoryId);
    }
}
