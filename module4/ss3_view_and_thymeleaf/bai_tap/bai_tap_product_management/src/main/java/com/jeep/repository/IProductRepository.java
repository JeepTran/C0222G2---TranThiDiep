package com.jeep.repository;

import com.jeep.model.Product;

import java.util.List;

public interface IProductRepository {

    List<Product> findAll();

    void save(Product product);

    void update(int id, Product product);

    void remove(Product product);

    Product findById(int id);

    List<Product> findByName(String name);
}
