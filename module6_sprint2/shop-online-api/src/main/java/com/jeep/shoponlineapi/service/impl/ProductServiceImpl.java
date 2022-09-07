package com.jeep.shoponlineapi.service.impl;

import com.jeep.shoponlineapi.model.Product;
import com.jeep.shoponlineapi.repository.IProductRepository;
import com.jeep.shoponlineapi.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public Page<Product> getAllProduct(Pageable pageable) {
        return this.productRepository.findAll(pageable);
    }
}
