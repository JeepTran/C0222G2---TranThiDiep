package com.jeep.service;

import com.jeep.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void create(Product product);

    void update(Product product);

    void delete(int id);

    Product findById(int id);

    List<Product> findByName(String name);
}
