package service.impl;

import model.Employee;
import repository.IEmployeeRepository;
import repository.impl.EmployeeRepositoryImpl;
import service.IEmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    IEmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void edit(Employee employee) {
        employeeRepository.edit(employee);
    }

    @Override
    public void delete(int employeeId) {
        employeeRepository.delete(employeeId);
    }

    @Override
    public Employee searchById(int employeeId) {
        return employeeRepository.searchById(employeeId);
    }

    @Override
    public List<Employee> searchByName(String employeeName) {
        return employeeRepository.searchByName(employeeName);
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
