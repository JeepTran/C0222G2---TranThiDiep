package repository.customer;

import model.customer.Customer;
import model.customer.CustomerType;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> findAll();

    List<CustomerType> findAllCustomerType();

    void addNewCustomer(Customer customer);

    void deleteCustomer(int deleteId);

    Customer findCustomerById(int id);

    void updateCustomerInfo(Customer customer);

    List<Customer> findCustomerByName(String searchName);

    List<Customer> findCustomerByMultiInfo(String searchName, String searchCustomerId, String searchCustomerTypeId);
}
