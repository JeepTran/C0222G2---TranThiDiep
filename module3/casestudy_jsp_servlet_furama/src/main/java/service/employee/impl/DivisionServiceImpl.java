package service.employee.impl;

import repository.employee.IDivisionRepository;
import repository.employee.impl.DivisionRepositoryImpl;
import service.employee.IDivisionService;

public class DivisionServiceImpl implements IDivisionService {
    private IDivisionRepository divisionRepository = new DivisionRepositoryImpl();



}
