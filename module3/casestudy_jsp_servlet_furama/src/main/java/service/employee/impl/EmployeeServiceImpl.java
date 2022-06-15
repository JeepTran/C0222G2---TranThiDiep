package service.employee.impl;

import model.employee.*;
import repository.employee.IEmployeeRepository;
import repository.employee.impl.EmployeeRepositoryImpl;
import service.employee.IEmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    private IEmployeeRepository employeeRepository = new EmployeeRepositoryImpl();


    @Override
    public Employee findEmployeeById(int id) {
        return employeeRepository.findEmployeeById(id);
    }

    @Override
    public List<Position> findAllPosition() {
        return employeeRepository.findAllPosition();
    }

    @Override
    public List<Employee> findEmployeeByName(String searchName) {
        return employeeRepository.findEmployeeByName(searchName);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void addNewEmployee(Employee employee) {
        employeeRepository.addNewEmployee(employee);
    }

    @Override
    public void updateEmployeeInfo(Employee employee) {
        employeeRepository.updateEmployeeInfo(employee);
    }

    @Override
    public void deleteEmployee(int deleteId) {
        employeeRepository.deleteEmployee(deleteId);
    }

    @Override
    public List<EducationDegree> findAllEducationDegree() {
        return employeeRepository.findAllEducationDegree();
    }

    @Override
    public List<Division> findAllDivision() {
        return employeeRepository.findAllDivision() ;
    }

    @Override
    public List<User> findAllUser() {
        return employeeRepository.findAllUser();
    }
}
