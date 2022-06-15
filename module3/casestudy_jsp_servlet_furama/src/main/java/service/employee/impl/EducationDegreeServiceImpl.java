package service.employee.impl;

import repository.employee.IEducationDegreeRepository;
import repository.employee.impl.EducationDegreeRepositoryImpl;
import service.employee.IEducationDegreeService;

public class EducationDegreeServiceImpl implements IEducationDegreeService {
    private IEducationDegreeRepository educationDegreeRepository = new EducationDegreeRepositoryImpl();



}
