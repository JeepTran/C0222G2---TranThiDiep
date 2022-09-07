package com.jeep.shoponlineapi.service;

import com.jeep.shoponlineapi.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService {

    Page<Product> getAllProduct(Pageable pageable);
}
