package com.jeep.thuc_hanh_3_them_san_pham_vao_gio_hang.service.impl;

import com.jeep.thuc_hanh_3_them_san_pham_vao_gio_hang.model.Product;
import com.jeep.thuc_hanh_3_them_san_pham_vao_gio_hang.repository.IProductRepository;
import com.jeep.thuc_hanh_3_them_san_pham_vao_gio_hang.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return this.productRepository.findById(id);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}
