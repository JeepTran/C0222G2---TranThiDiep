package service.employee.impl;

import repository.employee.IUserRepository;
import repository.employee.impl.UserRepositoryImpl;
import service.employee.IUserService;

public class UserServiceImpl implements IUserService {
    private IUserRepository userRepository = new UserRepositoryImpl();



}
