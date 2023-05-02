package com.ibrahimaktansanhal.kodlamaio.business.concretes;

import com.ibrahimaktansanhal.kodlamaio.business.abstracts.ProductService;
import com.ibrahimaktansanhal.kodlamaio.dataAccess.abstracts.ProductDao;
import com.ibrahimaktansanhal.kodlamaio.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }
}
