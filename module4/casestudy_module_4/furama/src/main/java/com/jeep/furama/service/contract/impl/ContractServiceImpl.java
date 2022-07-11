package com.jeep.furama.service.contract.impl;

import com.jeep.furama.model.contract.Contract;
import com.jeep.furama.repository.contract.IAttachFacilityRepository;
import com.jeep.furama.repository.contract.IContractDetailRepository;
import com.jeep.furama.repository.contract.IContractRepository;
import com.jeep.furama.service.contract.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractServiceImpl implements IContractService {

    @Autowired
    private IContractRepository contractRepository;
    @Autowired
    private IContractDetailRepository contractDetailRepository;
    @Autowired
    private IAttachFacilityRepository attachFacilityRepository;


    @Override
    public Page<Contract> findAllContract(Pageable pageable) {
        return this.contractRepository.findAllContract(pageable);
    }
}
