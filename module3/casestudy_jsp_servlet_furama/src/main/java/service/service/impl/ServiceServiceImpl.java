package service.service.impl;

import model.service.RentType;
import model.service.Service;
import model.service.ServiceType;
import repository.service.IServiceRepository;
import repository.service.impl.ServiceRepositoryImpl;
import service.service.IServiceService;

import java.util.List;

public class ServiceServiceImpl implements IServiceService {
    private IServiceRepository serviceRepository = new ServiceRepositoryImpl();


    @Override
    public List<Service> findAllService() {
        return serviceRepository.findAllService();
    }

    @Override
    public List<ServiceType> findAllServiceType() {
        return serviceRepository.findAllServiceType();
    }

    @Override
    public List<RentType> findAllRentType() {
        return serviceRepository.findAllRentType();
    }
}
