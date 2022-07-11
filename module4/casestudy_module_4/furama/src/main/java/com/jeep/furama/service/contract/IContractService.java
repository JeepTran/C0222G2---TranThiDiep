package com.jeep.furama.service.contract;

import com.jeep.furama.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IContractService {
    Page<Contract> findAllContract( Pageable pageable);
}
