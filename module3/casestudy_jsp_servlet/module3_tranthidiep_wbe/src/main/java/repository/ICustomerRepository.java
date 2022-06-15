package repository;

import model.Customer;

import java.util.List;

public interface ICustomerRepository {
    void save(Customer customer);
    void edit(int customerId);
    void delete(int customerId);
    Customer searchById(int customerId);
    List<Customer> searchByName(String customerName);
    List<Customer> findAll();
}
