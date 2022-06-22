package com.jeep.repository;

import com.jeep.model.Product;

import java.util.List;

public interface IProductRepository {

    List<Product> findAll();

    void create(Product product);

    void update(Product product);

    void delete(int id);

    Product findById(int id);

    List<Product> findByName(String name);

}
