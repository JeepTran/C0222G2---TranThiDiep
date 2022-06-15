package service.employee.impl;

import repository.employee.IRoleRepository;
import repository.employee.impl.RoleRepositoryImpl;
import service.employee.IRoleService;

public class RoleServiceImpl implements IRoleService {
    private IRoleRepository roleRepository = new RoleRepositoryImpl();




}
