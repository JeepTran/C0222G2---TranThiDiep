package com.jeep.service.impl;

import com.jeep.model.Product;
import com.jeep.repository.IProductRepository;
import com.jeep.repository.impl.ProductRepositoryImpl;
import com.jeep.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    private static IProductRepository productRepository = new ProductRepositoryImpl();


    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void create(Product product) {
        productRepository.create(product);
    }

    @Override
    public void update( Product product) {
        productRepository.update( product);
    }

    @Override
    public void delete(int id) {
        productRepository.delete(id);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findByName(String name) {
        return productRepository.findByName(name);
    }
}
