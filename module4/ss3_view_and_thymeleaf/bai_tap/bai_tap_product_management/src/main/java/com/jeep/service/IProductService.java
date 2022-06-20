package com.jeep.service;

import com.jeep.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    void update(int id, Product product);

    void remove(Product product);

    Product findById(int id);

    List<Product> findByName(String name);
}
