package com.jeep.exam_backend.service;

import com.jeep.exam_backend.model.Product;
import com.jeep.exam_backend.model.ProductBlock;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductBlockService {

    List<ProductBlock> getAllProductBlock();

    List<Product> getAllProduct();

    ProductBlock createProductBlock(ProductBlock productBlock);
}
