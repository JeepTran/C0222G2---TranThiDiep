package com.jeep.furama.repository.contract;

import com.jeep.furama.model.contract.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IContractRepository extends JpaRepository<Contract,Integer> {

    @Query(value = "select * from contract",
            nativeQuery = true,
            countQuery = "select * from contract")
    Page<Contract> findAllContract(Pageable pageable);
}
