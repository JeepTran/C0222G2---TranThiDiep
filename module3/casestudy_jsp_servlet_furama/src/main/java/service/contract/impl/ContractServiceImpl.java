package service.contract.impl;

import repository.contract.IContractRepostitory;
import repository.contract.impl.ContractRepositoryImpl;
import service.contract.IContractService;

public class ContractServiceImpl implements IContractService {
    private IContractRepostitory contractRepostitory = new ContractRepositoryImpl();


}
