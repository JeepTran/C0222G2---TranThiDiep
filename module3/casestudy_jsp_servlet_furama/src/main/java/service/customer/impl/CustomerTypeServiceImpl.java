package service.customer.impl;

import repository.customer.ICustomerTypeRepository;
import repository.customer.impl.CustomerTypeRepositoryImpl;
import service.customer.ICustomerTypeService;

public class CustomerTypeServiceImpl implements ICustomerTypeService {
private ICustomerTypeRepository customerTypeRepository = new CustomerTypeRepositoryImpl();


}
