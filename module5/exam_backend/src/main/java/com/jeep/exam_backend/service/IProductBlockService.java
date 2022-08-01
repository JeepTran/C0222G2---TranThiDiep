package com.jeep.exam_backend.service;

import com.jeep.exam_backend.model.Product;
import com.jeep.exam_backend.model.ProductBlock;

import java.util.List;
import java.util.Optional;

public interface IProductBlockService {

    List<ProductBlock> getAllProductBlock();

    List<Product> getAllProduct();

    ProductBlock createProductBlock(ProductBlock productBlock);

    Optional<ProductBlock> getProductBlockById(int id);

    void deleteProductBlockById(int id);


    ProductBlock editProductBlock(ProductBlock productBlock);
}
