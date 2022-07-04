package com.jeep.thuc_hanh_2_quan_ly_dien_thoai.repository;

import com.jeep.thuc_hanh_2_quan_ly_dien_thoai.model.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISmartphoneRepository extends JpaRepository<Smartphone,Long> {
}
