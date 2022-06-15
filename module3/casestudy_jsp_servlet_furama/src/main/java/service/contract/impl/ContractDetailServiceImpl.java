package service.contract.impl;

import repository.contract.IContractDetailRepository;
import repository.contract.impl.ContractDetailRepositoryImpl;
import service.contract.IContractDetailService;

public class ContractDetailServiceImpl implements IContractDetailService {
    private IContractDetailRepository contractDetailRepository = new ContractDetailRepositoryImpl();


}
