package com.jeep.thuc_hanh_3_them_san_pham_vao_gio_hang.repository;

import com.jeep.thuc_hanh_3_them_san_pham_vao_gio_hang.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Long> {
}
