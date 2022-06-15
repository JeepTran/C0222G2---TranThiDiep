package service.employee.impl;

import repository.employee.IUserRoleRepository;
import repository.employee.impl.UserRoleRepositoryImpl;
import service.employee.IUserRoleService;

public class UserRoleServiceImpl implements IUserRoleService {
private IUserRoleRepository userRoleRepository = new UserRoleRepositoryImpl();



}
