package service.service.impl;

import repository.service.IServiceTypeRepository;
import repository.service.impl.ServiceTypeRepositoryImpl;
import service.service.IServiceTypeService;

public class ServiceTypeServiceImpl implements IServiceTypeService {
    private IServiceTypeRepository serviceTypeRepository = new ServiceTypeRepositoryImpl();



}
