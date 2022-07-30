package com.jeep.exam_backend.repository;

import com.jeep.exam_backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Integer> {
}
