package com.jeep.thuc_hanh_2_quan_ly_dien_thoai.service;

import com.jeep.thuc_hanh_2_quan_ly_dien_thoai.model.Smartphone;

import java.util.Optional;

public interface ISmartphoneService {
    Iterable<Smartphone> findAll();

    Optional<Smartphone> findById(Long id);

    Smartphone save(Smartphone smartPhone);

    void remove(Long id);
}
