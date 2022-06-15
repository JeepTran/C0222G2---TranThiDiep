package repository;

import model.Contract;

import java.util.List;

public interface IContractRepository {
    void save(Contract contract);
    void edit(int contractId);
    void delete(int contractId);
    Contract searchById(int contractId);
    List<Contract> searchByName(String contractName);
    List<Contract> findAll();
}
