package com.example.restful.dao;

import com.example.restful.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductDao {


    List<Product> findAll();
    Optional<Product> findById(int id);
    Product insert(Product p);
    int update(Product p);
    int deleteById(int id);

}
