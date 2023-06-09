package com.ibrahimaktansanhal.kodlamaio.api.controllers;


import com.ibrahimaktansanhal.kodlamaio.business.abstracts.ProductService;
import com.ibrahimaktansanhal.kodlamaio.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getallproducts")
    public List<Product> getAllProducts(){
        return this.productService.getAllProducts();
    }
}
