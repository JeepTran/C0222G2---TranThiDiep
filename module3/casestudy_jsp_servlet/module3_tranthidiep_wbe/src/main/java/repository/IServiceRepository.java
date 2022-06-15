package repository;

import model.Service;

import java.util.List;

public interface IServiceRepository {
    void save(Service service);
    void edit(int serviceId);
    void delete(int serviceId);
    Service searchById(int serviceId);
    List<Service> searchByName(String serviceName);
    List<Service> findAll();
}
