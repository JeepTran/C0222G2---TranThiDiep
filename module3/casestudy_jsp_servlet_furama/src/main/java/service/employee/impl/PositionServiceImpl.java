package service.employee.impl;

import repository.employee.IPositionRepository;
import repository.employee.impl.PositionRepositoryImpl;
import service.employee.IPositionService;

public class PositionServiceImpl implements IPositionService {
    private IPositionRepository positionRepository = new PositionRepositoryImpl();



}
