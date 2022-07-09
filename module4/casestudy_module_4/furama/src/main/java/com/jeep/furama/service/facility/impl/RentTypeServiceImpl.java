package com.jeep.furama.service.facility.impl;

import com.jeep.furama.model.facility.RentType;
import com.jeep.furama.repository.facility.IRentTypeRepository;
import com.jeep.furama.service.facility.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeServiceImpl implements IRentTypeService {
    @Autowired
    private IRentTypeRepository rentTypeRepository;
    @Override
    public List<RentType> findAllRentType() {
        return rentTypeRepository.findAll();
    }
}
