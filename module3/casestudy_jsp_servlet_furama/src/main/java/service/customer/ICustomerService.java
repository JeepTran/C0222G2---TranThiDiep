package service.customer;

import model.customer.Customer;
import model.customer.CustomerType;

import java.util.List;
import java.util.Map;

public interface ICustomerService {
    List<Customer> findAll();

    List<CustomerType> findAllCustomerType();

    Map<String, String> addNewCustomer(Customer customer);

    void deleteCustomer(int deleteId);

    Customer findCustomerById(int id);

    Map<String, String> updateCustomerInfo(Customer customer);

    List<Customer> findCustomerByMultiInfo(String searchName, String searchCustomerId, String searchCustomerTypeId);
}
