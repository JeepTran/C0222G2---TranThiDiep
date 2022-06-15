package service.service.impl;

import repository.service.IRentTypeRepository;
import repository.service.impl.RentTypeRepositoryImpl;
import service.service.IRentTypeService;

public class RentTypeServiceImpl implements IRentTypeService {
    private IRentTypeRepository rentTypeRepository = new RentTypeRepositoryImpl();


}
