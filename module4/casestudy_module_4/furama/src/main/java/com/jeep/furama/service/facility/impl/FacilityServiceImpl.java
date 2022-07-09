package com.jeep.furama.service.facility.impl;

import com.jeep.furama.model.facility.Facility;
import com.jeep.furama.repository.facility.IFacilityRepository;
import com.jeep.furama.service.facility.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FacilityServiceImpl implements IFacilityService {
    @Autowired
    IFacilityRepository facilityRepository;

    @Override
    public Page<Facility> findAllFacilityByKeyword(String keyword, Pageable pageable) {
        return facilityRepository.findAllFacilityByKeyword(keyword,pageable);
    }

    @Override
    public Facility save(Facility facility) {
        return facilityRepository.save(facility);
    }

    @Override
    public Optional<Facility> findFacilityById(int id) {
        return this.facilityRepository.findById(id);
    }

    @Override
    public void deleteFacilityById(int id) {
        this.facilityRepository.deleteById(id);
    }
}
