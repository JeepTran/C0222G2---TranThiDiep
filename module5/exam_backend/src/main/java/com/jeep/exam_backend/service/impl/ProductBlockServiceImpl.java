package com.jeep.exam_backend.service.impl;

import com.jeep.exam_backend.model.Product;
import com.jeep.exam_backend.model.ProductBlock;
import com.jeep.exam_backend.repository.IProductBlockRepository;
import com.jeep.exam_backend.repository.IProductRepository;
import com.jeep.exam_backend.service.IProductBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductBlockServiceImpl implements IProductBlockService {
    @Autowired
    private IProductBlockRepository productBlockRepository;
    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<ProductBlock> getAllProductBlock() {
        return this.productBlockRepository.findAll();
    }

    @Override
    public List<Product> getAllProduct() {
        return this.productRepository.findAll();
    }

    @Override
    public ProductBlock createProductBlock(ProductBlock productBlock) {
        return this.productBlockRepository.save(productBlock);
    }

}
