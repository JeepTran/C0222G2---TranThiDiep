package com.jeep.furama.service.facility.impl;

import com.jeep.furama.model.facility.FacilityType;
import com.jeep.furama.repository.facility.IFacilityTypeRepository;
import com.jeep.furama.service.facility.IFacilityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityTypeServiceImpl implements IFacilityTypeService {
    @Autowired
    private IFacilityTypeRepository facilityTypeRepository;

    @Override
    public List<FacilityType> findAllFacilityType() {
        return facilityTypeRepository.findAll();
    }
}
