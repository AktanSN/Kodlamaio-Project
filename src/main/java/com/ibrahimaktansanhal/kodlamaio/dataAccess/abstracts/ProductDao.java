package com.ibrahimaktansanhal.kodlamaio.dataAccess.abstracts;

import com.ibrahimaktansanhal.kodlamaio.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
