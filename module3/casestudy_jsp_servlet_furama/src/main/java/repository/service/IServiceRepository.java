package repository.service;

import model.service.RentType;
import model.service.Service;
import model.service.ServiceType;

import java.util.List;

public interface IServiceRepository {
    List<Service> findAllService();

    List<ServiceType> findAllServiceType();

    List<RentType> findAllRentType();
}
