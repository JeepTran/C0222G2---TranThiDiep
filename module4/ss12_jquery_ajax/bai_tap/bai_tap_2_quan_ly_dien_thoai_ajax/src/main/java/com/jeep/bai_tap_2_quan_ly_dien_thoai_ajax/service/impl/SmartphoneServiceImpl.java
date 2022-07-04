package com.jeep.bai_tap_2_quan_ly_dien_thoai_ajax.service.impl;

import com.jeep.bai_tap_2_quan_ly_dien_thoai_ajax.model.Smartphone;
import com.jeep.bai_tap_2_quan_ly_dien_thoai_ajax.repository.ISmartphoneRepository;
import com.jeep.bai_tap_2_quan_ly_dien_thoai_ajax.service.ISmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SmartphoneServiceImpl implements ISmartphoneService {
    @Autowired
    private ISmartphoneRepository smartphoneRepository;

    @Override
    public Iterable<Smartphone> findAll() {
        return this.smartphoneRepository.findAll();
    }

    @Override
    public Optional<Smartphone> findById(Long id) {
        return this.smartphoneRepository.findById(id);
    }

    @Override
    public Smartphone save(Smartphone smartPhone) {
        return this.smartphoneRepository.save(smartPhone);
    }

    @Override
    public void remove(Long id) {
        this.smartphoneRepository.deleteById(id);
    }
}
