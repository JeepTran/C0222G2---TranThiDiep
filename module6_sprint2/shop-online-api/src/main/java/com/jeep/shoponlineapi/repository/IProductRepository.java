package com.jeep.shoponlineapi.repository;

import com.jeep.shoponlineapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product,Integer> {
}
