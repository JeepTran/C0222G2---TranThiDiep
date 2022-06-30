package com.jeep.thuc_hanh_3_them_san_pham_vao_gio_hang.service;

import com.jeep.thuc_hanh_3_them_san_pham_vao_gio_hang.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> findAll();
    Optional<Product> findById(Long id);

    Product save(Product product);
}
