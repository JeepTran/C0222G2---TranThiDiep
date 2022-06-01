package service.impl;

import model.Customer;
import repository.ICustomerRepository;
import repository.impl.CustomerRepository;
import service.ICustomerService;
import java.util.List;


public class CustomerService implements ICustomerService {
    private ICustomerRepository iCustomerRepository = new CustomerRepository();


    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        this.iCustomerRepository.save(customer);
    }

    @Override
    public Customer findById(int id) {
        return iCustomerRepository.findById(id);
    }

    @Override
    public void update(int id, Customer customer) {
        this.iCustomerRepository.update(id, customer);
    }

    @Override
    public void remove(int id) {
        this.iCustomerRepository.remove(id);
    }
}
