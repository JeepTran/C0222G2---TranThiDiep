package com.jeep.furama.repository.contract;

import com.jeep.furama.model.contractDetail.ContractDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContractDetailRepository extends JpaRepository<ContractDetail,Integer> {
}
