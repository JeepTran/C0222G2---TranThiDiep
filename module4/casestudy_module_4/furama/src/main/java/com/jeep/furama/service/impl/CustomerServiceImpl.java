package com.jeep.furama.service.impl;

import com.jeep.furama.model.customer.Customer;
import com.jeep.furama.model.customer.CustomerType;
import com.jeep.furama.repository.ICustomerRepository;
import com.jeep.furama.repository.ICustomerTypeRepository;
import com.jeep.furama.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;
    @Autowired
    private ICustomerTypeRepository customerTypeRepository;


    @Override
    public List<CustomerType> findAllCustomerType() {

        return this.customerTypeRepository.findAll();
    }

    @Override
    public Customer save(Customer customer) {
        return this.customerRepository.save(customer);
    }

    @Override
    public Page<Customer> findAllCustomer(Pageable pageable) {
        return this.customerRepository.findAllCustomer(pageable);
    }

    @Override
    public Page<Customer> findAllCustomerByKeyword(String keyword, Pageable pageable) {
        return this.customerRepository.findAllCustomerByKeyword(keyword,pageable);
    }

    @Override
    public Optional<Customer> findCustomerById(int id) {
        return this.customerRepository.findById(id);
    }

    @Override
    public void deleteCustomerById(int id) {
        this.customerRepository.deleteById(id);
    }
}
