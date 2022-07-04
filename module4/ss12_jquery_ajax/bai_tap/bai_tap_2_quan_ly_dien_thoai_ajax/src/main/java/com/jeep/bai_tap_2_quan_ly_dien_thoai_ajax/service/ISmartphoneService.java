package com.jeep.bai_tap_2_quan_ly_dien_thoai_ajax.service;

import com.jeep.bai_tap_2_quan_ly_dien_thoai_ajax.model.Smartphone;

import java.util.Optional;

public interface ISmartphoneService {
    Iterable<Smartphone> findAll();

    Optional<Smartphone> findById(Long id);

    Smartphone save(Smartphone smartPhone);

    void remove(Long id);
}
