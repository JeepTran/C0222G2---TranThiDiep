package service;

import model.Employee;

import java.util.List;

public interface IEmployeeService {
    void save(Employee employee);
    void edit(Employee employee);
    void delete(int employeeId);
    Employee searchById(int employeeId);
    List<Employee> searchByName(String employeeName);
    List<Employee> findAll();
}
